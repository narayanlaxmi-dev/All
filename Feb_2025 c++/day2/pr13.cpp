/* 
write a prog scan product info as 
product name
rate of product
quantity of product
amount =rate*quantity

if amount>=5000 discount =10% on amount
otherwise 5% on amount
calc netamount
and print discount and netamount
*/

#include<iostream>
using namespace std;
int main(){
	float r_pd, amount, quantity_pd, discount, net_amount;
	char pd_name[20];
	
	cout<<"Enter product name :";
	cin>>pd_name;
	cout<<"Enter rate of product :";
	cin>>r_pd;
	cout<<"Enter quantity of product:";
	cin>>quantity_pd;
	
	amount=r_pd * quantity_pd;
	cout<<"Product info :"<<amount;
	
	if(amount>=5000){
//		discount =amount-((amount*10)/100); //overall formula

		discount = (amount * 10) / 100;
		net_amount = amount - discount;
		cout<<discount;
		}	else 	
				if(amount <= 5000){	
					discount= (amount * 5) / 100;
					net_amount= amount - discount;
					}
		
		cout<<"\n product name :"<<pd_name;
		cout<<"\n rate of product :"<<r_pd;
		cout<<"\n quantity of product:"<<quantity_pd;
		cout<<"\n Discount:"<<discount;
		cout<<"\n Net Amount:"<<net_amount;
}
	