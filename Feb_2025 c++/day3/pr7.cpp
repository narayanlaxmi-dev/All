/* write a prog print factorial for sacn  no
 multiply we assign 1
 addition we assign 0
when we increment then condition <= 10 or n
when we decrement then condition >= 1 or n
*/

#include<iostream>
using namespace std;

int main(){
	int fact=1, no, copy ;
	cout<<"Enter number to print factorial :\n";
	cin>>no;
	copy = no;
	
	while(no >= 1){// when we decrement then condition >= 1
		fact = fact * no;
		no --;
	}
	cout<<"\n"<<copy<<" Factorial is "<<fact;
	
	return 0;
}