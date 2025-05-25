/* write a prog j
*/

#include<iostream>
using namespace std;

main(){
	int i,j;
	
	for(i=1; i<=5; i++){ // outer loop for row
		
		for(j=1; j<=5; j++){ // inner loop for column
			cout<<" "<<i;
		}
		cout<<" \n";
	}
}