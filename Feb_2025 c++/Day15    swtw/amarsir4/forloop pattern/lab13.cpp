/* write a prog c++ pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j , f=0, r=5;
	for(i=0; i<=5; i++){
		
		for(j=0; j<=5; j++){
			
			if(j==0 || i==0 ||j==5 || i==5 || j==r || j==f)
			cout<<"*";
				 else
			cout<<" ";
		}
		f++;
		r--;
		cout<<"\n";
		}
	}
	
