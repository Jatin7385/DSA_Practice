class Solution {
    // To check if a string is alphanumeric. Not required here
    public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }
    public boolean isPalindrome(String s) {
        String s1 = "";
        s = s.toLowerCase();
        System.out.println(s);
        for(int i = 0; i<s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                s1 = s1 + s.charAt(i);
            }
        }
        System.out.println(s1);
        
        //Palindrome code
        int i = 0;
        int j = s1.length()-1;
        
        while(i<=j)
        {
            char c = s1.charAt(i);
            char d = s1.charAt(j);
            if(c!=d){return false;}
            i++;
            j--;
        }
        
        return true;
    }
}