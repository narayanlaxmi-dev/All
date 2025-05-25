/* OOPs Ex 3 Class
write a prog scan to bank class implement si=p*r*n/100
amount =p+si;
for 3 objects fd
for process seperate fun 
*/
#include<iostream>
#include<cstring>
using namespace std;

class bank{
	
	private: 
		int p_amount, year;
		float rate, si, amount;

		
		
	public:
		void set(){ // to initial value
								
			cout << "\nEnter principle amount :";
			cin >> p_amount;
			cout << "Enter rate of intrest :";
			cin >> rate;
			cout << "Enter nubmer of year :";
			cin >> year;						
		}
		
		void show(){
			cout<<"\n\n\tThe FD of Employee";
			cout<<"\nPrinciple amount = " << p_amount ;
			cout<<"\nRate of intrest = "<< rate ;
			cout<<"\nNubmer of year = "<< year ;
			cout<<"\nSimple Intrest = "<< si ;
			cout<<"\nAmount to be Paid = "<< amount ;
		}
		
		void calculate(){
				si = (p_amount * rate * year) / 100 ;
				amount = p_amount + si;			
		}
};


main()
{
	bank narayan, neyan, fd1;	
	narayan.set();
	neyan.set();
	fd1.set();
		
	narayan.calculate();
	neyan.calculate();
	fd1.calculate();
	
	narayan.show();
	neyan.show();
	fd1.show();
	
}