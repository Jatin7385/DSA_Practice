// Question Link : https://practice.geeksforgeeks.org/problems/reverse-a-string/1
#include <cmath>
string reverseWord(string str){
    
    string rev;
  for(int i=0;i<=ceil((str.length()-1)/2);i++)
  {
        char temp = str[str.length()-1-i];
        str[str.length()-1-i] = str[i];
        str[i] = temp;
  }
  return str;
}
