// write prog reverse string using while 
#include<iostream>
using namespace std;

main(){
	string str="hello", s;
	int start=0, last = str.length()-1;
	
	cout<<"\n Enter string: ";
	cin>>s;
	int l = s.length()-1;
	cout<<"\n the array length:- "<<l<<" "<<last<<" string is:  "<<str<<endl;
	
	while(start < 1)
	{
		swap(str[start], str[last]);
		start++;
		last--;
	}
	cout<<str;
}