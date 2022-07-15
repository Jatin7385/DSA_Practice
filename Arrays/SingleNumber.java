class Solution {
    public int singleNumber(int[] nums) {
        /*
        Concept

            XOR of zero and some bit returns that bit
            a^0 = a
            XOR of two same bits returns 0
            a^a = 0
            XOR of a^b^a for some bits a and b returns b
            a^b^a = (a^a)^b = 0^b = b
            So we can XOR all bits together to find the unique number.
        */
        int res = 0;
        for(int a : nums)
        {
            res^=a;
        }
        return res;
    }
}