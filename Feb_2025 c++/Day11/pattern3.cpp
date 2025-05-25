#include<iostream>
using namespace std;
main(){
	int number, i=1, j=1, a=1;
	cout<<"Enter number to print patten: ";
	cin>>number;
	
	for(i; i<number; i++){
		for(j=1; j<i; j++){

			cout<<" "<<a;
			a++;
		}
		cout<<"\n";
	}
}