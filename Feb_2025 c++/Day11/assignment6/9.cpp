/*write simple bank management system
main welcome to bank 
display acount info
depost
withdraw
calc intrest default argument
modify balance 
*/
#include<iostream>
using namespace std;
void Display(string s, int bal){
	cout<<"\ndisplay the account holder name "<<s;
	cout<<"\ndisplay the account BALANCE "<<bal;
}

void deposit(int &balance, int amt){
	balance = balance + amt;
	cout<<"\n Balance updated successfully"<<balance;
}

void withdraw(int &balance, int amt){
	balance = balance - amt;
	cout<<"\n Balance updated successfully"<<balance;
}

float Si(int balance,int y,float r=3){

	cout<<"simple intrest bank fix rate"<<r;
	return (balance * y *r) / 100;
}

int& Balance_access(int &ba){
return ba;
}

main(){

	int balance, amt, wdarw, value, intrest =3;
	cout<<"--- WELCOME TO BANK SYSTEM ---";
	string name;
	cout<<"Enter name: ";
	cin>>name;
	cout<<"Enter balance: "<<endl;
	cin>>balance;
	
	int ch;
	while(ch>0){		
		cout<<"\nEnter 1 WITHDRAW\n"
				"Enter 2 DEPOSITE\n"
				"Enter 3  CHECK BALANCE\n"
				"Enter 4  CALCULATE SIMPLE INTREST\n"
				"Enter 5  MODIFY BALANCE\n"
				"Enter 5  DISPLAY NAME\n"
				"Enter 0  (exit) \n";
		cin>>ch;
		switch(ch)
		{
			case 1: cout<<"Enter amount: "<<endl;
					cin>>amt;
					deposit(balance, amt);
					break;
			case 2: cout<<"Enter withdraw: "<<endl;
					cin>>wdarw;
					withdraw(balance, wdarw);
					break;
			case 3: cout<<" the balance Current is: "<<balance;
					break;
					
			case 4:	cout<<"The area of Simple INTREST is: "<<Si(balance,2) <<endl;
					break;
			case 5:	cout<<"\n enter modify balance";
					cin>>value;
					Balance_access(balance) = value;
					cout<<"After Modified by user the balance is "<<balance << endl;
					break;
			case 6: Display(name,balance);
					break;
			case 0: cout<<"exiting...";
					system(0);
					break;
			default: cout<<"INVALID ENTRY....";
		}
	}
}