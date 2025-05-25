#include<iostream>
using namespace std;

main(){
	char s1[100] ;
	cout<<"Enter 2 string: ";
	gets(s1);
	cout<<"Print string: "<<s1;
	int len, i, count=0;
	len = sizeof(s1)/sizeof(s1[0]);
	
	for(i=0; i<len; i++){
		if(s1[i]== '0'|| s1[i]== '1'||s1[i]== '2'||s1[i]== '3'||s1[i]== '4'||s1[i]== '5'||s1[i]== '6'||s1[i]== '7'||s1[i]== '8'||s1[i]== '9')	
		count++;
	}
	if(count == 0)
		cout<<"\n NO number found in string";
	else
		cout<<"\nthe total "<<count<<" number present string";
}