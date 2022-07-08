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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> l = new ArrayList<>();
        if(root == null){return l;}
        q.add(root);
        q.add(null);
        List<Integer> l1 = new ArrayList<>();
        // Null is acting as a delimiter specifying that we have reached the next level
        while(!q.isEmpty())
        {
            TreeNode current = q.poll();// Removes the node at the first position of the queue
            
            if(current == null) //If we have reached the next level, then we add a null, saying that the left and right of the previous level have been added to the queue, and after this, is the next level.
            {
                l.add(l1);
                System.out.println(l1); 
                System.out.println(l);
			// Don't forget that if we clear l1, then since we have added l1 to l, l1 will show empty list. Deep copy, so we need to initialize a new arraylist everytime we want the empty list
                l1 = new ArrayList();
                System.out.println(l1); 
                System.out.println(l);
                if(q.isEmpty()){return l;}
                q.add(null);
                continue;
            }
            System.out.println(current.val);
            l1.add(current.val);
            if(current.left != null)
            {
                q.add(current.left);
            }
            
            if(current.right != null)
            {
                q.add(current.right);
            }
        }
        return l;
    }
}