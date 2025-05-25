/* write a prog print square & cube
squre 1 to 5 
cube 5 to 1
*/
#include<iostream>
using namespace std;

int main(){
	int sq= 1 ;
		
	cout<<"\nPrint square "<< sq << "...5\n";
	while(sq <= 5){	
		cout<<"\n" << "Square is "<< sq * sq;
		sq ++;
	}
	
	sq=5;
	cout<<"\nPrint cube "<< sq << "...1\n";
	while(sq >=1){	
		cout<<"\n" << "Cube is " << sq * sq * sq;
		sq --;
	}
	
	
	return 0;
}