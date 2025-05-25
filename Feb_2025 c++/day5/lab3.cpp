/* write a prog java pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j, num, v;
	
	cout<<"Enter Number";
	cin>>num;
	
	for(i = 1; i <= num; i++){ // outer loop for row
	
	 	v = i; // to number print by assign value of i 
	 	
		for(j = 1; j <= i; j++){ // inner loop for column
			cout<<" "<<v++ ;
		}
		cout<<"\n";
	}
}