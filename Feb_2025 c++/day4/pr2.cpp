/* prog 2 array scan and element user input end index

*/

#include<iostream>
using namespace std;
int main(){
	
	int num , i; // overflow concept [declare size] arr1[80]
	cout<<"Enter number of array you want to print :";
	cin>>num;
	
	int arr1[num];

	
	cout<<"Enter value for array  :";
	for(i=0; i<num; i++) // scan array 1
	{
		cin>>arr1[i];
	}
		
	// process for loop
	for(i=0; i<num; i++)
	{
		cout<<"\narray Entered ["<<i<<"] = "<<arr1[i];
	}
	return 0;
}