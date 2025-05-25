#include <iostream>
using namespace std;
int factorial(int x){
	
	if(0==x || 1==x)
		return 1;
	else 
	return (x * factorial(x-1));
	
}

main(){
	int n;
	cout<<"Enter number:";
	cin>>n;
	if(n<0)
		cout<<"number is negative";
	else
		cout<<"fatorial: "<<factorial(n);
	
}