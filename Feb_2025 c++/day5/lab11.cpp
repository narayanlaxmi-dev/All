/* write a prog c++ pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j,  x=9,y=9 ;
	
	for(i=1; i<=9; i++){
		
		for(j=1; j<=i; j++){
			
			if(j==1 || j==i || i==9)
				 cout<<"*";
			else
				cout<<" ";
		}
		cout<<"\n";
		}	
	}
	
