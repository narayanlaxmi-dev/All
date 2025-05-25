/* write a prog first 0 print then 1 

*/
#include<iostream>
using namespace std;

int main() {
    int arr[7] = {0, 1, 0, 0, 1, 1, 0}; 
    int count = 0;
    
    // Count the number of zeros
    for(int i = 0; i < 7; i++) {
        if(arr[i] == 0) {
            count++;
        }
    }
    
    // Print all zeros first
    for(int i = 0; i < count; i++) {
        cout <<" "<< 0;
    }
    
    // Print all ones after that
    for(int i = 0; i < 7 - count; i++) {
        cout<<" " << 1;
    }

    return 0;
}
