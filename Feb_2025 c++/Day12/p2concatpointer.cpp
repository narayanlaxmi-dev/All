#include<iostream>
using namespace std;
void func(char* s1, char* s2, char* s3){
	
	while(*s1 != '\0'){
		*s3= *s1;
		*s1++;
		*s3++;
	}
	
	while(*s2 != '\0'){
		*s3 = *s2;
		s2++;
		s3++;
	}
	*s3 = '\0';
}

main(){
	char s1[100] ,s2[100] ,s3[100];
	cout<<"Enter 2 string: ";
	cin>>s1>>s2;
	func(s1 ,s2, s3);
	cout<<"Concatenated string: "<<s3;
}