class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        map<int,int> nummaps;
        for(int i=0;i<nums.size();i++)
        {
            nummaps[nums[i]] += 1;
            if(nummaps[nums[i]] == 2)
            {
                return nums[i];
            }
        }    
        return 0;
    }
};
