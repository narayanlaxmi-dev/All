/* write a prog to calc simple intrest and emi 
si = principle_amount*rate*yr/100
amount = principle_amount*si
*/
#include<iostream>
using namespace std;
main(){
	// i/p
	char name[20] ;
	int principle_amount,yr;
	float rate,si,amount, emi;
	
	cout<<"Enter Name to get loan :";
//	cin>>name; // white space not allowed 
	gets(name);
	cout<<"Enter Amount :";
	cin>>principle_amount;
	cout<<"Enter Intrest Rate :";
	cin>>rate;
	cout<<"Enter Year :";
	cin>>yr;
	
	// process
	si = (principle_amount * rate * yr) / 100;
	amount = principle_amount + si;
	emi = amount / (yr*12); // total year of loan provide =yr and emi for months =12
	
	// o/p
	cout<<"\n \nLoan Details ";
	cout<<"\nIntrest = "<<si;
	cout<<"\nAmount to de Paid  = "<<amount;
	cout<<"\nAmount to de Paid for month  = "<<emi;

}