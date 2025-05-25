// prog 2 array scan and print addition onther array
#include<iostream>
using namespace std;
int main(){
	int arr1[5], arr2[5], total[5], i;
	
	cout<<"Enter value for array one :";
	for(i=0; i<5; i++) // scan array 1
	{
		cin>>arr1[i];
	}
	cout<<"\nEnter value for array two :";
	for(i=0; i<5; i++) // scan array 2
	{
		cin>>arr2[i];
	}
	
	// process for loop
	for(i=0; i<5; i++)
	{
		total[i] = arr1[i]+arr2[i];
		cout<<"\ntotal of Two array ["<<i<<"] = "<<total[i];
	}
	return 0;
}