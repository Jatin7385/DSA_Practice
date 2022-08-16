// Newer approach
class Solution {
    public int removeDuplicates(int[] nums) 
	{
		int f = 1;
		for(int i = 1; i<nums.length;i++)
		{
            if(nums[i-1] != nums[i]) // Whenever the prev element is not the same as the curr element, we know that we have moved on to a unique element. And the first element is always going to be a unique element
            {
                nums[f] = nums[i];
                f++;
            }	
		}
            return f;
	}
}


/*
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        //The outer loop loops through the entire nums array once
        for(int i = 0; i<nums.length;i++)
        {
            int flag = 0;
            // The inner loop has the job of checking the current unique internal array in nums, which is from 0                till k. If arr[i] exists in the unique array list then we don't add it in the kth position, else                    we do.
            for(int j = 0; j < k ; j++)
            {
                if(nums[j] == nums[i])
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
*/
