class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[nums1.length];
        
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < m && j < n && index < nums1.length)
        {
            System.out.println("Hel" + Integer.toString(index));
            if(nums1[i] <= nums2[j])
            {
                System.out.println(nums1[i]);
                res[index] = nums1[i];
                i++;
            }
            else
            {
                System.out.println(nums2[j]);
                res[index] = nums2[j];
                j++;
            }
            index++;
        }
        System.out.println("Hello");
        
        while(i<m && index < nums1.length)
        {
            System.out.println("I");
            res[index] = nums1[i];
            i++;
            index++;
        }
        
        while(j<n && index < nums1.length)
        {
            System.out.println("J");
            res[index] = nums2[j];
            j++;
            index++;
        }
        System.out.println("Ok");
        i = 0;
        for(i = 0;i<nums1.length;i++)
        {
            nums1[i] = res[i];
        }
        
    }
}