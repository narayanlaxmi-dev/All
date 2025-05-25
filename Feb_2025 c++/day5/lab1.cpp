/* write a prog java pattern printing 
*/

#include<iostream>
using namespace std;

main(){
	int i,j;
	
	for(i=0; i<5; i++){ // outer loop for row
		
		for(j=0; j<5; j++){ // inner loop for column
			cout<<"*";
		}
		cout<<"\n";
	}
}