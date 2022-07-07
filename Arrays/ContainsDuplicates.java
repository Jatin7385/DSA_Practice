class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums)
        {
            if(map.get(a) == null)
            {
                map.put(a,1);
            }
            else
            {
                map.put(a,map.get(a) + 1);
                return true;
            }
        }
        return false;
        
    }
}