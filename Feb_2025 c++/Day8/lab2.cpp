/* write prog to array
*/
#include<iostream>
using namespace std;
main(){
	int array[5], i=0, remove, j=0 ,cpy[4] ;
		
	for(i=0; i<5; i++){
		cout<<"\nEnter array 5 element ";
		cin>>array[i];		
	}
	
	cout<<"\nEnter key ";
	cin>>remove;
	
	for(i=0; i<5; i++){
		
		if(array[i] != remove){
			cpy[j]=array[i];
			j++;
		}
	}		
	
	cout<<"\n-------"<<endl;
	for(j=0; j<4; j++){
		cout<< " "<<cpy[j];		
	}
	
}