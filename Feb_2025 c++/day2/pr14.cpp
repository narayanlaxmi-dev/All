/* write a prog menu driven
add, sub, multiply, div
2 number
*/

#include<iostream>
using namespace std;
int main(){
	int ch,no1,no2,add,sub,mul,div,mod;
	cout<<"Enter two number :";
	cin>>no1>>no2;
	
	cout<<"\n1 Enter addition\n2 Enter Subtraction\n3 Enter Multiplication\n4 Enter dividition\n5 Enter modulas ";
	cout<<"\nEnter choice";
	cin>>ch;
	switch(ch){
		case 1: add = no1 + no2 ;
				cout<<"Addtion :"<< add;
				break;
		case 2: sub = no1 - no2 ;
				cout<<"Subtraction :"<<sub;
				break ; 
		case 3: mul = no1 * no2 ;
				cout<<"Multiplication :"<<sub;
				break ; 
		case 4: div = no1 / no2 ;
				cout<<"Dividition :"<<div;
				break ; 
		case 5: mod = no1 % no2 ;
				cout<<"Modulas :"<<mod;
				break ; 
		
		default : "Not a valid Number" ;
	}
	return 0;
}
	