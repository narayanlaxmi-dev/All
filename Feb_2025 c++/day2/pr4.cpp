/* write a prog to calc simple intrest 
si = principle_amount*rate*yr/100
amount = principle_amount*si
*/
#include<iostream>
using namespace std;
main(){
	// i/p
	int principle_amount,yr;
	float rate,si,amount;
	
	cout<<"\nEnter Amount :";
	cin>>principle_amount;
	cout<<"\nYou enter Amount :"<<principle_amount;
	cout<<"\nEnter Intrest Rate :";
	cin>>rate;
	cout<<"\nYou enter Amount :"<<rate;
	cout<<"\nEnter Year :";
	cin>>yr;
	cout<<"\nYou enter Amount :"<<yr;
	
	
	// process
	si=principle_amount/rate/yr/100;
	amount=principle_amount+si;
	
	// o/p
	cout<<"\nSimple intrest = "<<si;

	cout<<"\nAmount to de Paid  = "<<amount;
	

}