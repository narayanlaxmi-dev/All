/* write a prog java pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j,k, space=4;
	
	for(i = 1; i <= 5; i++){ // outer loop for row

		for(j = 1; j <= space; j++){ // inner loop for column
			cout<<" " ;
		}
				
		for(k = 1; k <= i; k++){ // inner loop for column
			cout<<"*";// minor difference cnage pattern
		}
		space--;
		cout<<"\n";
	}
	
}