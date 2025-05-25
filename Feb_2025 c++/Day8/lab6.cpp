/* write prog to array, find second largest element in array
2 var larg and second large forloop every iterating check 

*/
#include<iostream>
using namespace std;

int main() {
    int arr[5], i, largest = 0, secondlargest = -1;

    cout << "Enter array elements : ";
    for(i = 0; i < 5; i++) {
        cin >> arr[i];
    }
    
    for(i = 0; i < 5; i++) { 
//    	check largest
        if(arr[i] > largest) {
            secondlargest = largest;  // Update secondlargest previous largest
            largest = arr[i];   // Update largest  current 
        }
//        check second largest
        else if(arr[i] > secondlargest && arr[i] != largest) {
            secondlargest = arr[i];   // Update second largest
        }
    }

    cout << "\nThe largest value in the array is " << largest;
    cout << "\nThe second largest value in the array is " << secondlargest;

    return 0;
}
