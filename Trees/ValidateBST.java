/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Integer prev;
    public boolean isBSTUsingLimit(TreeNode node, Integer min, Integer max)
    {
        // A null node is considered as a BST
        if(node == null)
        {
            return true;
        }
        
        
        if((min != null && node.val <= min) || (max != null && node.val >= max)) // We know that the current node's value needs to be within the given range for it to be a BST. Else we return false.
        {
            return false;
        }
        //Basically here, we are recursively calling the function for left as well as right children of the current node, while changing the limit values for each. For left subtree, the minimum remains the same, but we know that the max should be updated to the current node's value. And for the right subtree, the minimum value should be the current node's val and the max value remains the same.
        return (isBSTUsingLimit(node.left,min,node.val) && 
               isBSTUsingLimit(node.right,node.val,max));
        
    }
    
    public boolean inorder(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!inorder(root.left)) {
            return false;
        }
        if (prev != null && root.val <= prev) {
            return false;
        }
        prev = root.val;
        return inorder(root.right);
    }
    
    public boolean isValidBST(TreeNode root) {
        prev = null;
	  // An inorder traversal in a BST would give us a sorted array type of a structure. So we just keep checking the previous value with the current to see if it is sorted and if so, it is a ValidBST. We use prev, to remove the unnecessary space complexity of O(N) if we had used ArrayList to store all the values and then check if it is sorted.
        return inorder(root);
        // return isBSTUsingLimit(root,null,null);
    }
}