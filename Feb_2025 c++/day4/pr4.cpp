/* prog 2 string char calc length and index wise print
*/

#include<iostream>
using namespace std;
int main(){
	char str[100];
	int len;
	cout<<"\n Enter String :";
	gets(str);
	cout<<"\n String print : ";
	puts(str);
	len = strlen(str);
	cout<<"\n Length of String is :"<<len;
	
	for(int i; i<len; i++)
	{
		cout<<"\n String index ["<<i<<"] = "<<str[i];
	}
	
	return 0;
}