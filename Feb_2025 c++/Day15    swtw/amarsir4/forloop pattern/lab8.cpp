/* write a prog c++ pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j ;
	
	for(i=1; i<=5; i++){
		
		for(j=1; j<=5; j++){
			
			if(i==1 ||i==5 ||j==1 || j==5)
				cout<<"*";
			else
				cout<<"#";
		}
		cout<<"\n";
		}
		
		
	}
	
