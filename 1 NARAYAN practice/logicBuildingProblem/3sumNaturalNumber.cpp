// sume of natural number or n series sum
#include<iostream>
using namespace std;
 
int sumNatural(int n){ // ------------------------------------1
	int sum=0;
	for(int i=0; i<=n; i++){
		sum += i;
	}
	return sum;
}

int sumFormula(int number){ // ------------------------------------2
	return number * (number + 1) /2;
}


int findSum(int n){// ------------------------------------3
	if(n % 2==0)
		return n / 2 * 1LL * (n + 1);
	else 
		return  ((n + 1) / 2) * 1LL * n; 

}
main(){
	
	int number ;
	cout<<"\nEnter numnber to NATURAL number :";
	cin>>number;
	cout<<"\nThe sum is : "<<sumNatural(number);
	cout<<"\nOther method the sum is : "<<sumFormula(number);
	
	cout<<"\nBest the sum is : "<<findSum(number);
}