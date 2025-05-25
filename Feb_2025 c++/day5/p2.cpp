/* write prog Array fun to sum all array value
*/
#include<iostream>
using namespace std;
void sum(int x[]){ 
	
	int i, sum = 0;
	for(i=0; i<5; i++){ // print
		cout<<"\narray ["<<i<<"] = "<<x[i];
	}
	
	for(i=0; i<5; i++){ // process
		sum += x[i];
	}
	cout<<"\nThe Sum array elements is "<<sum;
}
int ret_fn(int x[]){
	int i, sum=0;
	for(i=0; i<5; i++){
		sum+= x[i];
	}
	return sum;
}

main(){
	int arr[5];
	cout<<"Enter array number of five :";
	
	
	for(int i =0; i<5; i++){// scan
		cin>>arr[i];
	}
	
	sum(arr);
	
	int s = ret_fn(arr);
	cout<<"\nThe sum of array elements is "<<s;
	
}