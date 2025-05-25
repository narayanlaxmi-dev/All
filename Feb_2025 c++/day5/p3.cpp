/* write prog Array fun to scan value if present found index
*/
#include<iostream>
using namespace std;
int search(int x[],int key){ 
	
	int i, idx = -1;//index
	
	for(i=0; i<5; i++){ // print
		cout<<"\narray ["<<i<<"] = "<<x[i];
	}
	
	for(i=0; i<5; i++){// process
		if(x[i] == key){
			idx = i ;
			break;
		}
	}
	return (idx);
}


main(){
	int arr[5], key;
	cout<<"Enter array number of five :";
		for(int i =0; i<5; i++){
		cin>>arr[i];
		}
	cout<<"Enter key :";
	cin>>key;
	
	int s = search(arr, key);
	
	if(s 
	>= 0) // 
		cout<<"/nThe key "<<key<<" is present in "<<s<<" position";
	else
	cout<<"/nNot found";
}