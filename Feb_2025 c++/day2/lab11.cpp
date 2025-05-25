/* write a prog calc employee gross salary based on their basic salary
basic salary
hra =20%
da =50%
bonus 10% if greater then 50,000
*/

#include<iostream>
using namespace std;
int main(){
	int salary;
	float hra, da, bonus = 0, gross_sal = 0;
	
	cout<<"Enter Salary :";
	cin>>salary;
	
	hra = (salary * 20) / 100;
	da = (salary * 50) / 100;
	
	cout<<"Basic Salary"<<salary;
	cout<<"\n HRA :"<<hra;
	cout<<"\n DA :"<<da;
	
	if(salary > 50000){
		bonus = (salary * 10) / 100;
		gross_sal = bonus + salary + hra + da;
		cout<<"\n Total Gross salary ="<<gross_sal;
	}
		else {
			gross_sal= salary + hra + da;
			cout<<"\n Total Gross salary ="<<gross_sal;
		}
		
	
	return 0;
}
	