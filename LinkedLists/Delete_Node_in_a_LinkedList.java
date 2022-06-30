/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //Logic could be to delete the last node but before that, we shift all the nodes to the left by ignoring
        // the node that is given to us because that needs to be deleted.
        
        ListNode temp = node;
        while(temp.next.next != null)
        {
            temp.val = temAp.next.val;
            temp = temp.next;   
        }
        temp.val = temp.next.val;
        temp.next = null;
        
    }
}