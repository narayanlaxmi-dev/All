/* write a prog c++ pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j , f=0, r=8;
	for(i=0; i<9; i++){
		
		for(j=0; j<9; j++){
			
		
			
			if(i==4 || j==4 || f==j || r==j)
				cout<<" * ";
			else
				cout<<"  ";
			
		}
		f++;
		r--;
		cout<<"\n";
		}
	}
	
