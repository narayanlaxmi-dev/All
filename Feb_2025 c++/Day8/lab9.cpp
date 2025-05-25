/* write array element those pair sum is small
define array with static value find 1 var
var take user to input
*/


#include<iostream>
using namespace std;

 main() {
    static int  arr[6]= {1,2,3,4,5,6} ;
	int target;
	
	cout<<"Enter number to search array";
	cin>>target;
	
	// outer for first number
    for(int i = 0; i < 6; i++) { 
    	// inner for second number
    	for(int j=i+1; j< 6; j++){
    		
    		// An array 2 value is compare with target
			if(arr[i]+arr[j] == target)
				cout<<"The target is: "<<target <<" the array value used "<<arr[i]<<" "<<arr[j]<<endl ;
			
		}
	}	
}