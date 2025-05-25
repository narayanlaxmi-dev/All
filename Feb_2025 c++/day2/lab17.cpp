/* write a prog calc electricity bill based on following condition
income <=250000  not tax
income 250001 = 500000 5%tax
income 500000 = 1000000 20%tax
income>1000000
*/

#include<iostream>
using namespace std;
int main(){
	float income, tax;
	cout<<"Enter electricity bill paid to income amount for discount ";
	cin>>income;
	

		if(income <= 250000)
			cout<<"NO Tax";
		else if(income <= 250001 && income <= 500000){
				tax = income * 5 / 100;
				cout<<"Total tax to be paid "<<tax;
		}
		else if(income <= 500001 && income <= 1000000){
				tax = income * 20 / 100;
				cout<<"Total tax to be paid "<<tax;
		}
		else if(income <= 1000000){
				tax = income * 30 / 100;
				cout<<"Total tax to be paid "<<tax;
		}	
		else
			cout<<"Not Valid";

	
	return 0;
}
	