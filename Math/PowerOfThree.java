class Solution {
    public boolean isPowerOfThree(int n) {
        //n = 3^x, means x = log3(n)
        // And log3(n) = log10(n)/log10(3)
        //If the double value%1 == 0 meaning there is no decimal part to the x value, so it is true.
        
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}