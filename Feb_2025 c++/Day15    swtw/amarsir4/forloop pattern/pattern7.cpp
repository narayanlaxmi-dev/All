#include<iostream>
using namespace std;
main(){
	int i=0, j=0;
	string str;
	cout<<"Enter String to print patten: ";
	cin>>str;
	int ln = str.length(); // strlen(str); or str.size();
	
	cout<<"the string length is: "<< ln <<endl;
	
	for(i=0; i<=ln-1; i++){
		for(j=0; j<=i; j++){
			
			cout<<" "<<str[j];		
		}
		cout<<"\n";
	}
	
	for(i=ln-1; i>0; i--){
		for(j=0; j<i; j++){
			
			cout<<" "<<str[j];
		}
		cout<<"\n";
	}
}

/*
Enter String to print patten: hello
the string length is: 5
 h
 h e
 h e l
 h e l l
 h e l l o
 h e l l
 h e l
 h e
 h
--------------------------------
*/