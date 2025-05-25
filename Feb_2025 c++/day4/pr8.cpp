/* prog str copy
*/

#include<iostream>
using namespace std;
int main(){
	char str[100], cpy[100]; // cpy also same size
	int len ;
	
	cout<<"\n Enter String :";
	gets(str);
	cout<<"\n String print : ";
	puts(str);
	strcpy(cpy, str);
	len = strlen(str);
	cout<<"copy  string "<<cpy;
	cout<<"\nLength of String is :"<<len;
	
	
	return 0;
}