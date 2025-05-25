#include<iostream>
using namespace std;
main(){
	int number, i=0, j=0;
	char ch='a', c='A';
	cout<<"Enter number to print patten: ";
	cin>>number;
	
	for(i; i<number; i++){
		for(j=0; j<number; j++){

			cout <<" " << c << ch; // a=95 A=65
			c++;
			ch++;
		}
		cout<<"\n";
	}
}