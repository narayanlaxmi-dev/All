/* write a prog simple an atm transaction 
user enter amount to withdraw
amt,bal,withdraw
*/

#include<iostream>
using namespace std;
int main(){
	int bal = 10000, amount , withdraw;
	cout<<"Enter Amount to Withdraw =";
	cin>>amount;
	 if(amount % 100 == 0){
	 	if(amount<bal){
	 		withdraw = bal - amount;
	 		cout<<"Successfully withdraw"<<withdraw;
		 }else
	 	cout<<"\n Balance Not Sufficient ";
	 }else
	 	cout<<"\n Balance Not Sufficient";
	
	return 0;
}
	