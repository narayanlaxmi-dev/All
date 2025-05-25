#include<iostream>
using namespace std;
main(){
	int number, i=1, j=1, a=1;
	cout<<"Enter number to print patten: ";
	cin>>number;
	
	for(i=1; i<=number; i++){
		char c='a', ch='A';
		
		for(j=1; j<=i; j++){
			cout<<" "<<ch<<c;
			c++;
			ch++;
		}
		cout<<"\n";
	}
}
/*
Enter number to print patten: 5
 Aa
 Aa Bb
 Aa Bb Cc
 Aa Bb Cc Dd
 Aa Bb Cc Dd Ee

--------------------------------
*/