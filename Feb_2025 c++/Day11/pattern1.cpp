#include<iostream>
using namespace std;
main(){
	int number, i=0, j=0;
	char ch='A';
	cout<<"Enter number to print patten: ";
	cin>>number;
	
	for(i; i<number; i++){
		for(j=0; j<number; j++){
			
			cout<<"A"; //  i 0000 // j 0123
//			cout << " " <<ch; //abcd 
//			ch++;
		}
		cout<<"\n";
	}
}
/*
Enter number to print patten: 5
 A B C D E
 F G H I J
 K L M N O
 P Q R S T
 U V W X Y

--------------------------------
*/