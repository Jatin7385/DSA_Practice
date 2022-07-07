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
    public int maxDepth(TreeNode root) {
        // Does 2 things, when reached a leaf node, returns 0, so that the count starts from here to the top
        // Second, if the root node = null, then it returns 0 because the height = 0, if root = null
        if (root == null)
        {
            return 0;
        }
        
        int lDepth = maxDepth(root.left); // The height that is returned from the left subtree of the current node
        int rDepth = maxDepth(root.right); // The height that is returned from the right subtree of the current node
        
        if(lDepth > rDepth) // We return the max of the left and right subtree of the current node, because we just want the max Depth. Doesn't matter if it is from the left or the right. +=1 adds the current node into the height.
        {
            lDepth += 1;
            return lDepth;
        }
        else
        {
            rDepth += 1;
            return rDepth;
        }
    }
}