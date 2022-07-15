class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
            else
            {
                map.put(s.charAt(i), 1);
            }
        }
        
        for(int i=0; i<t.length(); i++)
        {
            if(map1.containsKey(t.charAt(i)))
            {
                map1.put(t.charAt(i),map1.get(t.charAt(i)) + 1);
            }
            else
            {
                map1.put(t.charAt(i), 1);
            }
        }
        
        System.out.println("H : " + map);
        System.out.println("H1 : " + map1);
        
        if(map.size() != map1.size())
        {
            System.out.println("The two maps don't have the same sizes");
            return false;
        }
        
        for(Map.Entry e : map.entrySet())
        {
            if(map.containsKey(e.getKey()))
            {
                if(!e.getValue().equals(map1.get(e.getKey()))) // Check out the concept of Boxed values and equality. Since the values are in a wrapper type Integer and not int, == compares them as references and not values.
                {
                    System.out.println("The two maps don't have the same value for key : " + e.getKey() + " --> " + e.getValue() + " , " + map1.get(e.getKey()) + " , " + (e.getValue() == map1.get(e.getKey())));
                    return false;
                }
            }
            else
            {
                System.out.println("Map 2 doesn't contain the key : " + e.getKey());
                return false;
            }
        }
        
        return true;
    }
}