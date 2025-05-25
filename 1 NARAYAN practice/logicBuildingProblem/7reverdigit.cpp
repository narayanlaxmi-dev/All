#include<iostream>
using namespace std;

int reverseDigit(int n){
	int revno =0;
	while(n>0){
		revno = revno * 10 + n % 10;
		n=n/10;
	}
	return revno;
}
main(){
	int n;
	cout<<"Enter number: ";
	cin>>n;
	cout<< reverseDigit(n)<< ": the value of this: "<<n<<endl;
}