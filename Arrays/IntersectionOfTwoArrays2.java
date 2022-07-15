class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Creating hashmaps for nums1 array
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0; i<nums1.length;i++)
        {
            if(map1.containsKey(nums1[i]))
            {
                map1.put(nums1[i],map1.get(nums1[i]) + 1);
            }
            else
            {
                map1.put(nums1[i],1);
            }
        }
        
        // Creating hashmap for nums2
        for(int i=0; i<nums2.length;i++)
        {
            if(map2.containsKey(nums2[i]))
            {
                map2.put(nums2[i],map2.get(nums2[i]) + 1);
            }
            else
            {
                map2.put(nums2[i],1);
            }
        }
        System.out.println("HM1" + map1);
        System.out.println("HM2" + map2);
        ArrayList<Integer> ar = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map1.entrySet())
        {
            System.out.println(e.getKey() + " , " + e.getValue());
            if(map2.containsKey(e.getKey()))
            {
                int m = e.getValue();
                int n = map2.get(e.getKey());
                
                int res = Math.min(m,n);
                System.out.println(e.getKey() + " , " + e.getValue() + " , " + m + " , " + n + " , " + res);
                for(int i=0;i<res;i++)
                {
                    ar.add(e.getKey());
                }
                
            }
        }
        int arr[] = new int[ar.size()];
        for(int i = 0 ;i < ar.size(); i++)
        {
            arr[i] = ar.get(i);
        }
        return arr;
    }
}