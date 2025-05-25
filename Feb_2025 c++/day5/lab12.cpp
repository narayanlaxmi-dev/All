/* write a prog c++ pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j  ;
	
	for(i=5; i>=1; i--){
		
		for(j=1; j<=5; j++){
			
			if(j==1 || i==j || i==5 )
			cout<<"*";
				 else
			cout<<" ";
			
		}
		cout<<"\n";
		}	
	}
	
