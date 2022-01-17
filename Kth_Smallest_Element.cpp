//Question Link : https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

class Solution{
    public:
    // Merge Sort : 
    void merge(int arr[],int l,int m, int r,int size)
    {
        int i = l;// Starting position of left subarray
        int j = m+1;// Starting position of left subarray
        int k = l; // Starting position of temporary array
        int temp[size];
        while(i<=m && j<=r)
        {
            if(arr[i]<arr[j])
            {
                temp[k] = arr[i];
                i++;k++;
            }
            else
            {
                temp[k] = arr[j];
                j++;k++;
            }
        }
        
        //If the length of both subarrays is not the same
        while(i<=m)
        {
             temp[k] = arr[i];
             i++;k++;
        }
        
        while(j<=r)
        {
             temp[k] = arr[j];
             j++;k++;
        }
        
        //Copying the temp array into arr
        for(int s = l;s<=r;s++)
        {
            arr[s] = temp[s];
        }
    }
    void mergeSort(int arr[],int l, int r,int size)
    {
        if(l>=r){return;}
        auto mid = (l+r)/2;
        mergeSort(arr,l,mid,size);
        mergeSort(arr,mid+1,r,size);
        merge(arr,l,mid,r,size);
    }
    
    
    // arr : given array
    // l : starting index of the array i.e 0
    // r : ending index of the array i.e size-1
    // k : find kth smallest element and return using this function
    int kthSmallest(int arr[], int l, int r, int k) {
        // Apply merge sort
        mergeSort(arr,l,r,r+1);
        return arr[k-1];
    }
};
