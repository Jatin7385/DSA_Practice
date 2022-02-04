#include <iostream>
using namespace std;

void displayArray(int arr[])
{
    for(int i=0;i<9;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

// A modified version of quick sort partition algorithm
void rearrange(int arr[])
{
    int i=0;//i from the 0th index
    int j=8; //Starting j from the last index
    int pivot = 0; //pivot is 0, because we want all the negative numbers on one side, and the positive numbers on the other side

    while(i<j)
    {
        // Find the element(arr[i]) greater than 0
        while(arr[i]<=pivot && i<j)
        {
            i++;
        }
        // Find the element(arr[j]) less than 0
        while(arr[j]>=pivot && i<j)
        {
             j--;
        }
        // Once these elements are found, we swap them
       //Swapping the elements at i and j
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Once i>j, we stop the loop and switch the pivot element with the jth position
    displayArray(arr);
}

int main()
{
    int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
    cout<<"The Array before rearrangement :-"<<endl;
    displayArray(arr);
    cout<<"The Array after rearrangement :-"<<endl;
    rearrange(arr);
}
