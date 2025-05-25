#include<iostream>
using namespace std;
main(){
	int number, i=1, j=1, a=1;
	cout<<"Enter number to print patten: ";
	cin>>number;
	
	for(i=number; i>=0; i--){
		for(j=1; j<=i; j++){

			cout<<" "<<a;
			a++;
		}
		cout<<"\n";
	}
}
/*
Enter number to print patten: 4
 1 2 3 4
 5 6 7
 8 9
 10


--------------------------------
*/