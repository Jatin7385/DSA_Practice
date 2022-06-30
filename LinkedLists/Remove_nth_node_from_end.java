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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode prev = head;
        int i = 0;
        while(temp != null)
        {
            if(i < 2)
            {
               prev = head; 
            }
            else
            {
                prev = prev.next;
            }
            ListNode temp1 = temp;
            int count = 0;
            while(temp1 != null)
            {
                count++;
                temp1 = temp1.next;
            }
            if(count == n && prev == temp && prev != null && head != null)// When we need to remove the first node from the linked list
            {
                head = head.next;
                temp = head;
                prev = head;
            }
            else if(count == n && prev != null && temp != null)// This is the nth node from the end
            {
                // System.out.println(prev.val + " , " + temp.val);
                prev.next = temp.next;
            } 
            // System.out.println(prev.val + " , " + temp.val);
            // System.out.println("h : " + count);
            if(temp != null){
            temp = temp.next;
            }
            else{break;}
            i++;
        }
        return head;
    }
}