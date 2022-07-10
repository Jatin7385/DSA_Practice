class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            curSum += nums[i];
            System.out.println(nums[i] + " , " + curSum + " , " + maxSum);
            if(curSum > maxSum){maxSum = curSum;}
            if(curSum < 0){curSum = 0;}
        }
        return maxSum;
    }
}