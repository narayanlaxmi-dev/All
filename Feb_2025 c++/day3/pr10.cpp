/* write a prog print fibonacci series upto n terms
no<-user input
var1=0 var2=1 fibo=1
a=b
b=fibo
fibo=var1+var2
*/

#include<iostream>
using namespace std;

int main(){
	int num , var1=0, var2=1, fibo=1;
	cout<<"Enter Number to print fibonacci series ";
	cin>>num;
	cout<<"Print Fibonacci Series upto "<<num;
	cout<<"\n"<<var1;
	cout<<"\n"<<var2;
	
	while(fibo<= num){
		cout<<"\n"<<fibo;
		var1=var2;
		var2=fibo;
		fibo=var1+var2;
	}
	return 0;
}