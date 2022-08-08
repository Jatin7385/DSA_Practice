class Solution {
    public int myAtoi(String s) {
        int firstFlag = 0; int positiveFlag = 1;
        int signFlag = 0;
        String num = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '+' && signFlag == 0 && firstFlag == 0)
            {
                positiveFlag = 1;
                signFlag = 1;
            }
            else if(s.charAt(i) == '-' && signFlag == 0 && firstFlag == 0)
            {
                positiveFlag = 0;
                signFlag = 1;
            }
            else if(signFlag == 1 && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            {
                break;
            }
            else if(s.charAt(i) == ' ' && firstFlag == 0)
            {
                if(signFlag == 0)
                {
                    continue;
                }
                else{break;}
            }
            else if(s.charAt(i) == ' ' && (firstFlag == 1 || signFlag == 1))
            {
                break;
            }
            else if(!Character.isDigit(s.charAt(i)))
            {
                break;
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                firstFlag = 1;
                num = num + s.charAt(i);
            }
        }
        
        System.out.println("Number : " + num + " positiveFlag : " + positiveFlag);
        
        int res = 0;
        for(int i = 0; i < num.length(); i++)
        {
            int a = num.charAt(i) - '0'; //Converting char to int
            if(positiveFlag == 1 && res + (a * Math.pow(10,(num.length()-1-i))) >= Integer.MAX_VALUE)
            {
                System.out.println("H1 : " + (Integer.MAX_VALUE - 1));
                return Integer.MAX_VALUE;
            }
            else if(positiveFlag == 0 && (-1 * res) - (a*Math.pow(10,(num.length()-1-i))) <= Integer.MIN_VALUE)
            {
                System.out.println("H2 : " + (Integer.MIN_VALUE - 1));
                return Integer.MIN_VALUE;
            }
            else
            {
                res += a*Math.pow(10,(num.length()-1-i));
            }
            System.out.println(i + " : " + a + " : " + res);
        }
        
        if(positiveFlag == 0){res *= -1;}
        
        if(res == Integer.MAX_VALUE * -1 && positiveFlag == 0 && num.equals("2147483648")){res -= 1;} // Calculations are happening from in +ve, and +ve limit for int is till 2^31 - 1. So if the number is supposed to be negative, then it should go till -2^31. Hence we subtract 1
        
        System.out.println(res+":" + Integer.MIN_VALUE);
        return res;
        
    }
}