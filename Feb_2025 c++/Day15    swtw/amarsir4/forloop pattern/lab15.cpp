/* write a prog c++ pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j ;
	
	for(i=0; i<=10; i++){
		
		for(j=0; j<=10; j++){
		
			if(i<5 && j<1 || i==0 && j>=5 ||i==10 && j<5 ||i>=5 && j==10 ||i==5|| j==5)
				cout<<"* ";
			else
				cout<<"  ";
		}
		cout<<"\n";
		}	
	}
	
