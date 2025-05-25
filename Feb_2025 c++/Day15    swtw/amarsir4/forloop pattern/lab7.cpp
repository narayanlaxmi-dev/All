/* write a prog java pattern printing input number
*/

#include<iostream>
using namespace std;

main(){
	int i,j,k, s=7 ;
	
	for(i=1; i<7; i++){
		int t=i;// to number print by assign value of i 
		for(j=1; j<i; j++){
			cout<<" ";
			
			
		}
		for(k=1; k<s; k++){
			cout <<t++ <<" ";
			}	
			cout<<"\n";
			s--;
		
	}
	
}