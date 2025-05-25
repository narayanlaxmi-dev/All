#include <iostream>
using namespace std;


bool contains(int arr[], int size, int value) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == value) {
            return true; 
        }
    }
    return false;  
}

int main() {
    
    int arr[] = {10, 20, 30, 40, 50};
    int size = sizeof(arr) / sizeof(arr[0]); 
    int value = 30;  

    if (contains(arr, size, value)) {
        cout << "The array contains the value " << value << "." << endl;
    } else {
        cout << "The array does not contain the value " << value << "." << endl;
    }

    return 0;
}
