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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Same concept as the merge portion of merge sort
        if(list1 == null && list2 == null)
        {
            return null;
        }
        else if(list1 == null)
        {
            return list2;
        }
        else if(list2 == null)
        {
            return list1;
        }
        ListNode res = new ListNode();
        ListNode temp = res;
        int i = 0;
        // System.out.println(res.val + " , " + i);
        while(list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                if(i == 0)
                {
                    temp.val = list1.val;
                    list1 = list1.next;
                }
                else
                {
                    temp.next = new ListNode();
                    temp = temp.next;
                    temp.val = list1.val;
                    list1 = list1.next;
                }
            }
            else
            {
                if(i == 0)
                {
                    temp.val = list2.val;
                    list2 = list2.next;
                }
                else
                {
                    temp.next = new ListNode();
                    temp = temp.next;
                    temp.val = list2.val;
                    list2 = list2.next;
                }
            }
            System.out.println(temp.val + " , " + i);
            i++;
        }
        
        // For the unfinished list 1
        while(list1 != null)
        {
            if(i == 0)
            {
                temp.val = list1.val;
                list1 = list1.next;
            }
            else
            {
                temp.next = new ListNode();
                temp = temp.next;
                temp.val = list1.val;
                list1 = list1.next;
            }
            System.out.println(temp.val + " , " + i);
            i++;
        }
        
        // For the unfinished list 2
        while(list2 != null)
        {
            if(i == 0)
            {
                temp.val = list2.val;
                list2 = list2.next;
            }
            else
            {
                temp.next = new ListNode();
                temp = temp.next;
                temp.val = list2.val;
                list2 = list2.next;
            }
            System.out.println(temp.val + " , " + i);
            i++;
        }
        
        return res;
        
    }
}