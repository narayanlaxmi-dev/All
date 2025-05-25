/* write prog to array, value, positiob
prompt msgg value instert array
traversal start last index of array to  user position
ar[i]= arr[i-1];
arr[position]=value;
*/
#include<iostream>
using namespace std;
main(){
	int array[5]= {1,2,3,4}, i, value, position  ;
	cout<<"Enter to insert Value array element ";
	cin>>value;
	cout<<"Enter to insert index position ";
	cin>>position;
	for(i=4; i>position; i--){
		array[i] = array[i-1];		
	}
	
	array[position] = value;
	for(i=0; i<5; i++){
		cout<<" "<<array[i];
	}
}