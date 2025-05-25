// get put getline
#include<iostream>
using namespace std;

main(){
	char str, s[20];
	int count;
	cin.get(str); // single char
	// stirng goes to next line break loop
	while(str !='\n'){ 
		
		cout.put(str);
		count++;
		cin.get(str);
	}
	cout<<"\n The number of character = "<< count;
	//---------------------------
	cout<<\nEenter string";
	cin.getline(s,20);
	cout<<"\n String = " << s;
}