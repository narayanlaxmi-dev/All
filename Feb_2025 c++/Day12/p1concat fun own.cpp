#include<iostream>
using namespace std;
void func(char s1[], char s2[], char s3[]){
	int i=0, j=0;
	while(s1[i] != '\0'){
		s3[j] = s1[i];
		i++;
		j++;
	}
	i=0;
	while(s2[i] != '\0'){
		s3[j] = s2[i];
		i++;
		j++;
	}
	s3[j] = '\0';
}

main(){
	char s1[100] ,s2[100] ,s3[100];
	cout<<"Enter 2 string: ";
	cin>>s1>>s2;
	func(s1 ,s2, s3);
	cout<<"Concatenated string: "<<s3;
}