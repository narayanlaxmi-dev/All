/* write a prog scan str and calc of length without using function
create your own function
call by value function calc length
call by refrence functuin calc length
*/
#include<iostream>
using namespace std;

// call by value
int mylen(char s[]){
	int i=0;
	while(s[i] != '\0'){
		i++;
	}
	return i;
}

// call by Refrence
int mylen1(char *str){
	int i=0;
	while(*str != '\0'){
		i++;
		str++;
	}
	return i;
}
main(){
	
	char str[50];
	cout<<"Enter string to check length: ";
	cin>>str;
	cout<<"\n You enter: "<<str;
	
	int len = mylen(str);
	int l = mylen1(str);
	cout<<"The value fun length is = "<<len;
	cout<<"\nThe refrence fun length is = "<<l;
}