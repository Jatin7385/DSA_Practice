class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
            String fizzbuzz = "";
            if(i%3 == 0)
            {
                fizzbuzz += "Fizz";
            }
            if(i%5 == 0)
            {
                fizzbuzz += "Buzz";
            }
            if(fizzbuzz.length() == 0)
            {
                fizzbuzz += Integer.toString(i);
            } 
            res.add(fizzbuzz);
        }
        return res;
    }
}