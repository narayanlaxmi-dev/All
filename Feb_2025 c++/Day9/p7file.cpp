// get put getline
#include<iostream>
using namespace std;

main(){
	char str[50];
	float a;
	cout<< "\n Enter string";
	cin.getline(str, 50); 
	cout<< "\n " <<str << "\n";
	cout.write(str,7);
	//--------
	cout.width(10);
	cout.fill('*');
	cout<<"NAME";
	cout.width(20);
	cout<<"\n Address ";
	cout<<str;
	
	
	cout<<"\nEnter number ";
	cin>>a;
	cout.precision(3); // after decimal only 3 place return
	cout<<"\n A= "<<a;
}