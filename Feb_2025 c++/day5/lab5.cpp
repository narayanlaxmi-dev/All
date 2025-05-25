/* write a prog java pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j,k, num;
	
	cout<<"Enter Number";
	cin>>num;
	int space=num-1;

	for(i = 1; i < num; i++){ // outer loop for row
 
		for(j = 1; j < space; j++){ // inner loop for column
			cout<<" ";
		}
		
		for(k = 1; k < i; k++){ // inner loop for column
			cout << "*" ;
		}
		space-- ;
		cout<< "\n";
	}
	
}