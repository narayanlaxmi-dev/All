//create porg to access and modify array element
#include<iostream>
using namespace std;

// int& this return address
int& getindex(int arr[], int index){
return arr[index];
}


main(){
	int arr[]= {1,2,3,4,5};
	int index;
	cout<<"Enter the index to update value:";
	cin>>index;
	// to change value index = 100
	getindex(arr,index) = 100;
	
	for(int a:arr){
		cout<<a<<" ";
	}
}