class Solution {
    public void rotate(int[] nums, int k) {
        // Two pointer approach
        // Rotate the last k elements
        // Rotate the first n-k elements
        // Rotate the entire array
        // This will give us the final array
        if(k>0 && k!=nums.length)
        {
            int p2 = 0;
            int p1 = 0;

            // 1) Rotate the last k elements
            p1 = (nums.length-k)%nums.length;
            p2 = (nums.length-1)%nums.length;

            while(p1 < 0)
            {
                p1 += nums.length;
            }

            while(p2 < 0)
            {
                p2 += nums.length;
            }

            System.out.println(p1 + " , " + p2);

            while(p1<p2)
            {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2--;
            }

            // 2) Rotate the first n-k elements
            p1 = 0;
            p2 = (nums.length - 1 - k)%nums.length;

            while(p2 < 0)
            {
                p2 += nums.length;
            }

            System.out.println(p1 + " , " + p2);

            while(p1<p2)
            {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2--;
            }

            // 3) Rotate the entire array
            p1 = 0;
            p2 = (nums.length-1)%nums.length;

            while(p2 < 0)
            {
                p2 += nums.length;
            }

            System.out.println(p1 + " , " + p2);

            while(p1<p2)
            {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2--;
            }

        }    
    }
}