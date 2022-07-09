class Solution {
    public int arr[];
    public int count;
    public void climb(int n, int i)
    {
        if(i>=n)
        {
            if(i == n)
            {
                System.out.println("Reached 5"+ " , " + count);
                count++;
            }
            else
            {
                System.out.println("Crossed 5"+ " , " + count);
            }
            return;
        }
        if(i+1 <=n && arr[i+1] == -1)
        {
            System.out.println("Calling +1 fn : " + i + " , " + count);
            int count1 = count;
            climb(n,i+1);
            if(count - count1!=0)
            {
                if(arr[i] != -1)
                    arr[i] += count - count1;
                else
                    arr[i] = count - count1;
            }
        }
        else if(i+1 <=n)
        {
            System.out.println("No need to call +1 fn : " + i + " , " + count);
            arr[i] += arr[i+1];
            count += arr[i+1];
        }
        
        if(i+2 <=n && arr[i+2] == -1)
        {
            System.out.println("Calling +2 fn : " + i + " , " + count);
            int count1 = count;
            climb(n,i+2);
            if(count - count1!=0)
            {
                if(arr[i] != -1)
                    arr[i] += count - count1;
                else
                    arr[i] = count - count1;
            }
        }
        else if(i+2 <=n)
        {
            System.out.println("No need to call +2 fn : " + i+ " , " + count);
            arr[i] += arr[i+2];
            count += arr[i+2];
        }
        return;
    }
    public int climbStairs(int n) {
        arr = new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            arr[i] = -1;
        }
        count = 0;
        climb(n,0);
        
        for(int i=0;i<2*n;i++)
        {
            System.out.println(i + " , " + arr[i]);
        }
        
        return count;
    }
}