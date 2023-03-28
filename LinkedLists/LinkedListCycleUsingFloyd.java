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
    // Using Floyd Cycle Finding Algorithm :- 
    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(slowPointer != null && fastPointer != null && fastPointer.next != null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer)
            {
                return true;
                // break;
            }
        }

        // if(slowPointer != fastPointer){return null}
        // slowPointer = head;
        // while(slowPointer!= fastPointer)
        // {
        //     slowPointer = slowPointer.next;
        //     fastPointer = fastPointer.next;
        // }

        // return slowPointer;
        return false;
    }
}