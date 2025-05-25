//create deposite and withdraw function uisng call by refrece  modify balance
#include<iostream>
using namespace std;

void deposit(int &balance, int amt){
	balance = balance + amt;
	cout<<"\n Balance updated successfully"<<balance;
}

void withdraw(int &balance, int amt){
	balance = balance - amt;
	cout<<"\n Balance updated successfully"<<balance;
}


main(){
	int balance, amt, wdarw;
	cout<<"Enter balance: "<<endl;
	cin>>balance;
	
	int ch;
	while(ch>0){		
		cout<<"\nEnter 1 withdraw\n"
				"Enter 2 Deposit\n"
				"Enter 3  check balance\n"
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
			case 0: cout<<"exiting...";
					system(0);
					break;
			default: cout<<"INVALID ENTRY....";
		}
	}
}