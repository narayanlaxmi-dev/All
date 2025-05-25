/* write a prog java pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j, num;
	
	cout<<"Enter Number";
	cin>>num;
	
	for(i=1; i <= num; i++){ // outer loop for row
		
		for(j=1; j <= num; j++){ // inner loop for column
			cout<<i;
		}
		cout<<"\n";
	}
}