void rotate(int arr[], int n)
{
    int arr1[n];
    arr1[0] = arr[n-1]; 
    for(int i=1;i<n;i++)
    {
        arr1[i] = arr[i-1];
    }
    
    for(int i=0;i<n;i++)
    {
        arr[i] = arr1[i];
    }
}
