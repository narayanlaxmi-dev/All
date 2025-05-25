/* write a prog java pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j, num, s=num;
	
	cout<<"Enter Number";
	cin>>num;
	
	for(i = 1; i <= num; i++){ // outer loop for row
 
		for(j = num; j >= i; j--){ // inner loop for column
			cout<<"* " ;
		}
		cout<<"\n";
	}
	cout<<"----------------------\n";
	for(i = 1; i <= num; i++){ // outer loop for row
 
		for(j = num; j >= i; j--){ // inner loop for column
			cout<<"* " ;
		}
		cout<<"\n";
	}
	
}