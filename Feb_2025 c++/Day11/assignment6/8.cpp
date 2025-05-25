/*write display information fun overloading two diff way function name same 
name and balance value
balance
*/
#include<iostream>
using namespace std;

// function overloadinf same name multiple function
void Display(string s, int bal){
	cout<<"\ndisplay the account holder name "<<s;
	cout<<"\ndisplay the account BALANCE "<<bal;
}

void Display(int bal){	
	cout<<"\nONLY BALANCE display "<<bal;
}
main(){
	int balance;
	string name;
	cout<<"Enter name: ";
	cin>>name;
	cout<<"Enter balance: ";
	cin>>balance;
	Display(balance);
	cout<<"---------------------";
	Display(name,balance);
	
}