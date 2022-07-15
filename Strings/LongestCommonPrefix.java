class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Calculate minimum length
        int min = strs[0].length();
        for(int i = 1;i<strs.length;i++)
        {
            min = Math.min(min,strs[i].length());
        }
        System.out.println(min);
        
        String res = "";
        for(int i=1;i<=min;i++)
        {
            String prefix = strs[0].substring(0,i);
            System.out.println(prefix + i);
            for(int j = 0; j<strs.length; j++)
            {
                if(!strs[j].startsWith(prefix))
                {
                    return res;
                }
            }
            res = prefix;
        }
        
        return res;
    }
}