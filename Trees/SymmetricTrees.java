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
    // Considering t1 and t2 as two seperate trees
    public boolean isMirror(TreeNode t1, TreeNode t2)
    {
        if(t1 == null && t2 == null) return true; // If both are null, means both are equal so return true
        if(t1 == null || t2 == null) return false;// If only one of them is null, means both are not equal so return false
        
        if(t1.val != t2.val) return false;// If both values of the current nodes are not equal, then return false
        
        return (isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left)); 
        // With symmetry, we are checking the left with right always of the trees, because when we break the main tree in half, we want it to superimpose. Therefore, we check right with left and vice verse
    } 
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
}