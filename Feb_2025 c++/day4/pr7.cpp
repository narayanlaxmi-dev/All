/* prog str convert upper lower 
*/

#include<iostream>
using namespace std;
int main(){
	char str[100], ch, rp_ch; 
	int len ;
	
	cout<<"\n Enter String :";
	gets(str);
	cout<<"\n String print : ";
	puts(str);
	strupr(str); // upper
	puts(str);
	strlwr(str); // lower
	puts(str);
	
	len = strlen(str);
	cout<<"\nLength of String is :"<<len;
	
	
	return 0;
}