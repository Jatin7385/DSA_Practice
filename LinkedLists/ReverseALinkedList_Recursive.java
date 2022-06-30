/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return head;
        }
        System.out.println(head.val);
        if(head.next == null)
        {
            return head;
        }
        ListNode revHead = new ListNode();
        revHead = reverseList(head.next);
        ListNode temp = revHead;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new ListNode(head.val,null);
        temp = temp.next;
        return revHead;
    }
}