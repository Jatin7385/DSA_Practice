class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        int index = -1;
        
        int m = haystack.length();
        int n = needle.length();
        
        int index1 = -1;
        while(i < m && j < n)
        {
            System.out.println("i : " + i + " j : " + j + " Haystack char : " + haystack.charAt(i) + " needle char : " + needle.charAt(j) + " index : " + index1);
            if(haystack.charAt(i) == needle.charAt(j))
            {
                if(j == 0)
                {
                    index1 = i;
                    
                }
                j++;
            }
            else if(j!=0 && haystack.charAt(i) != needle.charAt(j))
            {
                j = 0;
                i = index1 + 1; // To come back to the point right after the start of haystack in needle
                index1 = -1;
                continue; // We don't want to increment i after setting it to the index after the start of needle in haystack false alarm scenario
            }
            i++;
        }
        
        if(i>=m && j<n)
        {
            return -1;
        }
        return index1;
    }
}