class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        
        while(i < nums.length)
        {
            if(nums[i] == 0)
            {
                while(j<nums.length)
                {
                    if(nums[j] != 0)
                    {
                        int temp = nums[j];
                        nums[j] = 0;
                        nums[i] = temp;
                        break;
                    }
                    j++;
                }
            }
            i++;
            j = i;
        }
    }
}