/* write a prog c++ pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j,  x=5,y=5 ;
	
	for(i=1; i<=5; i++){
		
		for(j=1; j<=9; j++){
			
			if(j==x || j==y || i==5)
				cout<<"*";
			else
				cout<<" ";		
		}
		x--;
		y++;
		cout<<"\n";
		}	
	}
	
