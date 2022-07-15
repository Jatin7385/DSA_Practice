class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length-1;i>=0;i--)
        {
            if(i == digits.length-1)
            {
                digits[i] += 1;
            }
            else if(carry != 0)
            {
                digits[i] += carry;
                carry = 0;
            }
            if(digits[i] == 10)
            {
                digits[i] = 0;
                carry = 1;
            }
        }
        
        if(carry != 0)
        {
            int res[] = new int[digits.length + 1];
            res[0] = 1;
            for(int i=1 ; i< digits.length; i++){res[i] = digits[i];}
            return res;
        }
        return digits;
    }
}