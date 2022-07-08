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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        
        return constructTreeFromArray(nums,0,nums.length-1);
    }
    
    public TreeNode constructTreeFromArray(int[] nums, int left, int right)
    {
        // [-10,-5,-3,0,5,8,9]
        // Assume this array, mid = 0 = root node. To the left should be -5, which is the mid of the left subarray, and to the right should be 8 which is the mid of the right subarray in the sorted array
        if(left>right)
        {
            return null;
        }
        
        int mid = (right + left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructTreeFromArray(nums,left,mid-1);
        root.right = constructTreeFromArray(nums,mid+1,right);
        
        return root;
    }
}