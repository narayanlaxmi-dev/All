#include<iostream>
using namespace std;

int main() {
    int array[5], i, cpy[5];

    cout << "Enter 5 elements to insert into the array: ";
    // input 
    for(i = 0; i < 5; i++) {
        cin >> array[i];
    }
    
    cout << "Reversed array: ";
    // Reversing the array and printing
    for(i = 4; i >= 0; i--) {
        cpy[i] = array[i];
        cout << cpy[i] << " ";
    }

    return 0;
}
