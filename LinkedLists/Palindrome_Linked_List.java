// Simplest way is to just add all the node values in an //ArrayList and then check for palindrome
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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(head != null)
        {
            arr.add(head.val);
            head = head.next;
        }
        
        //Palindrome check using two pointer approach
        int i = 0;
        int j = arr.size() - 1;
        
        while(i<j)
        {
            if(arr.get(i) != arr.get(j))
            {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}



// Issue with this solution is, it gives Time Limit Exceeded
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode reverseList(ListNode head,int tot)
//     {
//         ListNode temp = head;
//         int i = 0;
//         ListNode rev = new ListNode();
//         ListNode revHead = rev;
//         // rev = revHead;
//         //Counting the number of nodes present
        
//         i = tot/2; // Get the mid, because we want to reverse only half of the list
//         // System.out.println("SDF : " + i + " , " + tot);
//         // System.out.println(i);
        
        
//         for(int j = 0; j<i; j++)
//         {
//             // System.out.println(j + " , " + (i-j));
//             temp = head;
//             int count = 0;
//             while(count != (tot-j-1)) // Using tot here because we need to go till end - j - 1(to get the reverse of the second half of the list)
//             {
//                 // System.out.println(temp.val + " , " + count + " , " + (i-j-1));
//                 temp = temp.next;
//                 count++;
//             }
//             // System.out.println(temp.val + " , " + j);
//             if(j == 0){
//                 rev = new ListNode(temp.val,null);
//                 revHead = rev;
//             }
//             else
//             {
//                 rev.next = new ListNode(temp.val,null);
//                 rev = rev.next;
//             }
//             // System.out.println(j);
//         }
        
//         // while(revHead != null)
//         // {
//         //     System.out.println(revHead.val);
//         //     revHead = revHead.next;
//         // }
        
//         return revHead;
        
        
//     }
//     public boolean isPalindrome(ListNode head) {
        
//         if(head.next == null) //If there is only one node in the list, then it is a palindrome
//         {
//             return true;
//         }
        
//         ListNode temp = head;
//         ListNode rev = new ListNode();
//         ListNode revHead = rev;
        
//         ListNode temp1 = head;
        
//         int i = 0;
//         while(temp1 != null)
//         {
//             temp1 = temp1.next;
//             i++;
//         }
        
//         revHead = reverseList(temp,i);
        
//         rev = revHead;
//         int flag = 0;
//         while(rev != null)
//         {
//             System.out.println(rev.val + " , " + head.val);
//             // System.out.println(rev.val);
//             if(rev.val != head.val)
//             {
//                 flag = 1;
//                 break;
//             }
//             rev = rev.next;
//             head = head.next;
//         }
        
//         if(flag == 0)
//             return true;
//         else
//             return false;
        
        
//     }
// }