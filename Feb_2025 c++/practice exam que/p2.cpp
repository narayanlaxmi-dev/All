/*
Write a c++ program to accpet worker information 
Worker_Name, No_Of_Hours_Worked, Pay_Rate and Salary. 
Write necessary functions to calculate and display the
salary of Worker. (Use Default values for Pay_Rate)
*/

#include<iostream>
using namespace std;

int calcSalary(int no_house_worked ,int pay_rate) {
	return   pay_rate * no_house_worked;
}

void disaplay(string name, int no_house_worked, int pay_rate){
	cout<<" Worker Information \n";
	cout<<"Entered name: "<< name  << endl;
	cout<<"Payed to rate: "<< no_house_worked << endl;
	cout<<"Numbered of house he worked:"<<pay_rate<< endl ;
	cout<<"The salary worker to paid rate calculate: "<<calcSalary(no_house_worked, pay_rate)<< endl ;
}
int main(){
	
	string name;
	int no_house_worked, pay_rate, salary;
	cout<<"Enter name: ";
	getline(cin, name);
	cout<<"pay to rate: ";
	cin>>pay_rate;
	cout<<" number of house he worked:"; 
	cin>>no_house_worked;
	
	disaplay( name,  no_house_worked, pay_rate);
	
	return 0;
}