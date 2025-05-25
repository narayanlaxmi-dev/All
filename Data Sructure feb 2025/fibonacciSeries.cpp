#include <iostream>
using namespace std;
int fibonacci(int x){
	
	if(0==x || 1==x)
		return x; // retrun 0 or 1
	return fibonacci(x-1) + fibonacci(x-2);
	
}

main(){
	int n;
	cout<<"Enter number:";
	cin>>n;
	if(n<0)
		cout<<"number is negative not allowed";
	else{
		for(int i=0; i<n; i++){
			if(i<n-1)		
				cout<<fibonacci(i)<<", ";
			else
				cout<<fibonacci(i);
		}
	}
		
	
}