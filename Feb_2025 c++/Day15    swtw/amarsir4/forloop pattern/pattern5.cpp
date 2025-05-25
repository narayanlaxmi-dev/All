#include<iostream>
using namespace std;
main(){
	int number, i=1, j=1, a=1;
	char c='a', ch='A';
	cout<<"Enter number to print patten: ";
	cin>>number;
	
	for(i=number; i>=0; i--){
		for(j=1; j<=i; j++){

			cout<<" "<<ch<<c;
			c++;
			ch++;
		}
		cout<<"\n";
	}
}
/*

*/