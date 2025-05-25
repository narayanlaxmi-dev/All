/* prog user scan num number odd or even using function
create function which largest from 2 number
*/

#include<iostream>
using namespace std;

void oddeven(int x){
	
	if(x%2==0)
		cout<<"Even number\n";
	else
		cout<<"Odd number\n";

}

void largest(int a,int b){
	if(a>b)
	cout<<"a="<<a<<" is larger";
	else
	cout<<"b="<<b<<" is larger";
}

int main(){
	int number ;
	cout<<"Enter numbre to odd/Even";
	cin>>number;
	oddeven(number);
	cout<<" The number is divisible by 0";
	
	
	int a,b;
	cout<<"Enter 2 number to check larger";
	cin>>a>>b;
	largest(a,b);
	return 0;
}