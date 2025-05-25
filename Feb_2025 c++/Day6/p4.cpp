/*
write a prog bankloan class  with member var calc intrest= loan amount+ int   amount=loan amount * rate* year /100
*/

#include<iostream>
#include<cstdio>
using namespace std;

class bank_loan{
	private:
	int loan_number, loan_amount;
	char holder_name[30] ;
	float  rate_intrest, number_year, intrest, payable;
		
	public: 
		bank_loan(){
			rate_intrest= 5;
			number_year = 7.8;
		}
		
		void set_data(){
			cout<<"\n\nEnter loan Number :";
			cin>>loan_number;
			cout<<"Enter loan_amount :";
			cin>>loan_amount;
			cout<<"Enter holder_name :";
			cin>>holder_name;
//			gets(holder_name);
//			strcpy(holder_name, "name"); // single var only 
			
			intrest =(loan_amount * rate_intrest * number_year) /100 ;
			payable = intrest + loan_amount;
			
		}
		
		void display_data(){
			cout<<"\nEnter loan Number :"<<loan_number;
			cout<<"\nEnter loan amount :"<<loan_amount;
			cout<<"\nEnter holder name :"<<holder_name;
			cout<<"\nEnter number year :"<<number_year;
			cout<<"\nEnter rate intrest :"<<rate_intrest;
			cout<<"\nEnter loan intrest :"<<intrest;
			cout<<"\nEnter loan payable :"<<payable;
			
		}
};

main(){
	bank_loan object1 , object2  ;
	object1.set_data();
	object1.display_data();
	
	object2.set_data();
	object2.display_data();
	
}