/* write prog to array, second smallest element

*/
#include<iostream>
using namespace std;

int main() {
    int arr[5], i, largest = 999, secondlargest = 999;

    cout << "Enter array elements : ";
    for(i = 0; i < 5; i++) {
        cin >> arr[i];
    }
    for(i = 0; i < 5; i++) { 
// check smallest value in array
        if(arr[i] < largest) {
            secondlargest = largest;  // Update secondlargest previous largest
            largest = arr[i];   // Update largest  current 
        }
        
// check 2 smallest value in array
        else if(arr[i] < secondlargest ) {
            secondlargest = arr[i];   // Update second largest
        }
    }

    cout << "\nThe largest value in the array is " << largest;
    cout << "\nThe second largest value in the array is " << secondlargest;

    return 0;
}

