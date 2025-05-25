/*Write a C++ Program to accept 'n' numbers from user. 
store all Even and Odd Number in File "Even.txt" and "Odd.Txt".
*/

#include<iostream>
#include<fstream>
using namespace std;
main (){
	// file create using fstream class 
	ofstream fileobj1("even.txt");
	ofstream fileobj2("odd.txt");
	
	int number[100];
	cout<<"\n Enter number to chec (odd/even): ";
	
	for(int i=0; i<10; i++){
		cout<<"\n Enter number for ["<<i<<"] : ";
		cin>>number[i];
	}
	
	for(int i=0; i<10; i++){
		if(number[i]%2 ==0){
			fileobj1<<number[i];
		}
		else
			fileobj2<<number[i];
	}
}