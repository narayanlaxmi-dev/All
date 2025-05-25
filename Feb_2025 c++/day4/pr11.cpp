/* Palindrom
*/
#include<iostream>
using namespace std;
int main(){
	char str[100], rev[100];
	int i, len;
	
	cout<<"Enter String to check Palindrome :";
	gets(str);
	len = strlen(str);
	
	int j=0;
	for(i=len-1; i>=0; i--)
	{
		rev[j] = str[i];
		j++;
	}
		rev[j]='\0';// termination rev[j] increment or char rev[len];
	
	if(strcmp(str, rev) == 0)
	cout<<"Palindrome";
	else 
	cout<<"Not plaindrome";
	return 0;
}