/* write prog to array, duplicate value 2 array of integer value
*/
#include<iostream>
using namespace std;
main(){
	int arr1[5],i, arr2[5],j;
	
	cout<<"Enter array 1 :";
	for(i=0; i<5; i++){
		cin>>arr1[i];
	}
	cout<<"Enter array 2 :";
	for(i=0; i<5; i++){
		cin>>arr2[i];
	}

	for(i=0; i<5; i++){ // first aray 
		for(j=0; j<5; j++){ // secod array 
			
			if(arr1[i]== arr2[j]){
				cout<<"\nindex = "<<j<< endl;
				cout<<"Duplicate  "<<arr1[i]<<endl;
			}
		}	
	}
}