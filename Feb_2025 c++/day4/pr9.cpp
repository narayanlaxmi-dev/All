/* strcat(tst1, str2)
*/
#include<iostream>
using namespace std;
int main(){
	char str1[100], str2[100];
	
	cout<<"Enter String one :";
	gets(str1);
	cout<<"Enter String two :";
	gets(str2);
	cout<<"Join String :";
	strcat(str1,str2);
	cout<<"\n->"<<str1;
	
	strcat(str2,str1);
	cout<<"\n->"<<str2;
	return 0;
}