class Solution {
    public int countPrimes(int n) {
        // Using Sieve of Eratosthenes
        int res = 0;
        boolean[] pr = new boolean[n+1]; //Contains whether each no. is prime or not
        //Making all numbers prime to initialize the array
        for(int i=0;i<pr.length;i++)
        {
            pr[i] = true;
        }
        
        //Now, we start making false, each number from i*i, till n with an increment of i, if i is a prime.
        // Also the check is, if i*i is <=n because if it isn't then there is no point in checking, since we are checking for primes less than n.
        for(int i=2;i*i<=n;i++)
        {
            if(pr[i] == true)
            {
                for(int j = i*i;j<=n;j+=i)
                {
                    pr[j] = false;
                }
            }
        }
        
        //Finally counting the remaining primes, true in the array
        for(int i=2;i<n;i++)
        {
            if(pr[i] == true){res++;}
        }
        
        return res;
    }
}