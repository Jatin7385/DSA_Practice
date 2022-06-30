/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    // For constant memory, we can have a loop that goes till head != null. Internally, we will have another loop, that checks every node from the original head till the current node, if any node in between matches the current head.next. If so, then there is a cycle and we must return true;. Otherwise, we return false.
    
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        while(head != null)
        {
            arr.add(head);
            for(ListNode a : arr)
            {
                if(head.next == a)
                {
                    return true;
                }
            }
            head = head.next;
        }
        return false;
    }
}