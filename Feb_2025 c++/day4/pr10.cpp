/* strcmp ascii value 

to find ascii
int a;
for(i=65; i<256; i++)
	printf("%c = %d",a,a);
	
compare same return 0
compare diff return 1
*/
#include<iostream>
using namespace std;
int main(){
	char str1[100], str2[100];
	cout<<"Compare String True(0) / False(1)\n";
	cout<<"Enter String one :";
	gets(str1);
	cout<<"Enter String two :";
	gets(str2);

	
	int val = strcmp(str1,str2);
	
	if(strcmp(str1,str2) == 0)
		cout<<"\n"<<str1<<" Compare "<<str2<<" ->"<<val;
	else
		cout<<"\n"<<str1<<" Not Compare "<<str2<<" ->"<<val;
	
	return 0;
}