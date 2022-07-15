class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> str = new HashMap<Character,Integer>();
        // Adding each character and its frequency in a HashMap
        for(int i = 0; i<s.length();i++)
        {
            int a = 0;
            //key, value+1
            if(str.containsKey(s.charAt(i)))
            {
                a = 1;
                str.put(s.charAt(i), str.get(s.charAt(i)) + 1);
            }
            else
            {
                a = 2;
                str.put(s.charAt(i), 1);
            }
            System.out.println(s.charAt(i) + " , " + a + " , " + str.get(s.charAt(i)));
        }
        System.out.println("Delim");
        //For the first character with the frequency 1, we return the index
        for(int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i) + " : " + str.get(s.charAt(i)));
            if(str.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}