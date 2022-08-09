class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
            System.out.println(i + " s : " + s.charAt(i));
            if(i+1<s.length() && s.charAt(i) == 'I' && s.charAt(i+1) == 'X')
            {
                sum += 9;
                i+=1;
                if(i>=s.length())
                {
                    break;
                }
            }
            else if(i+1<s.length() && s.charAt(i) == 'I' && s.charAt(i+1) == 'V')
            {
                sum += 4;
                i+=1;
                if(i>=s.length())
                {
                    break;
                }
            }
            else if(s.charAt(i) == 'I')
            {
                sum += 1;
            }
            else if(s.charAt(i) == 'V')
            {
                sum += 5;
            }
            else if(i+1<s.length() && s.charAt(i) == 'X' && s.charAt(i+1) == 'L')
            {
                sum += 40;
                i+=1;
                if(i>=s.length())
                {
                    break;
                }
            }
            else if(i+1<s.length() && s.charAt(i) == 'X' && s.charAt(i+1) == 'C')
            {
                sum += 90;
                i+=1;
                if(i>=s.length())
                {
                    break;
                }
            }
            else if(s.charAt(i) == 'X')
            {
                sum += 10;
            }
            else if(i+1<s.length() && s.charAt(i) == 'C' && s.charAt(i+1) == 'D')
            {
                sum += 400;
                i+=1;
                if(i>=s.length())
                {
                    break;
                }
            }
            else if (i+1<s.length() && s.charAt(i) == 'C' && s.charAt(i+1) == 'M')
            {
                sum += 900;
                i+=1;
                if(i>=s.length())
                {
                    break;
                }
            }
            else if(s.charAt(i) == 'C')
            {
                sum += 100;
            }
            else if(s.charAt(i) == 'L')
            {
                sum += 50;
            }
            else if(s.charAt(i) == 'D')
            {
               sum += 500;
            }
            else if(s.charAt(i) == 'M')
            {
                sum += 1000;
            }
        }
        
        return sum;
    }
}