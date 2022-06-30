public ListNode reverseList(ListNode head)
    {
        ListNode temp = head;
        int i = 0;
        ListNode rev = new ListNode();
        ListNode revHead = rev;
        // rev = revHead;
        //Counting the number of nodes present
        while(temp != null)
        {
            i++;
            temp = temp.next;
        }
        // System.out.println(i);
        for(int j = 0; j<i; j++)
        {
            // System.out.println(j + " , " + (i-j));
            temp = head;
            int count = 0;
            while(count != (i-j-1))
            {
                // System.out.println(temp.val + " , " + count);
                temp = temp.next;
                count++;
            }
            // System.out.println(temp.val + " , " + j);
            if(j == 0){
                rev = new ListNode(temp.val,null);
                revHead = rev;
            }
            else
            {
                rev.next = new ListNode(temp.val,null);
                rev = rev.next;
            }
            // System.out.println(j);
        }
        
        return revHead;
        
        
    }