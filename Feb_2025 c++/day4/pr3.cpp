/* prog 2 array scan and factorial
5 var declare
*/

#include<iostream>
using namespace std;
int main(){
	
	int num , i; 
	cout<<"Enter  how many factorial you print :";
	cin>>num;
	
	int arr1[num];
	
	cout<<"Enter value for array  :";
	for(i=0; i<num; i++) 
	{
		cin>>arr1[i];
	}
	// for inner loop we have to declare temp var
	for(i=0; i<num; i++)
	{
		int temp = arr1[i]; 	// assign each time
		int fact=1; 			// reset each time
		for(; temp>0; temp--) 	// for initial temp; return or nothing 
		{ 
			fact = fact * temp;		
		}	
		
	arr1[i] = fact;
	cout<<"\n Factorial is : "<<arr1[i];
	}
	
	
	
	return 0;
}