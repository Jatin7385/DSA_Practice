class Solution{
    public:
    map<int, int> elementMap; 
    //Function to return the count of number of elements in union of two arrays.
    int doUnion(int a[], int n, int b[], int m)  {
        //code here
        set<int> union1;
        for(int i=0;i<n;i++)
        {
            union1.insert(a[i]);
        }
        for(int j=0;j<m;j++)
        {
            union1.insert(b[j]);
        }
        
        
        return union1.size();
    }
};
