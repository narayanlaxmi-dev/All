/* write prog to test if array contain specific value
delcare an array  find key present in array
*/
#include<iostream>
using namespace std;
main(){
	int array[5],i,key,  found=0;	
	for(i=0; i<5; i++){
		cout<<"\nEnter array 5 element ";
		cin>>array[i];		
	}
	cout<<"\nEnter key ";
	cin>>key;
	
	for(i=0; i<5; i++){
		if(array[i] == key){
			found=1;
			break;
		}
	
	}
		if(found == 1)
			cout<<" \nvalue is found at index "<<i<<" key is "<<key;
		else
			cout<<" \nvalue is NOT found ";
	
}