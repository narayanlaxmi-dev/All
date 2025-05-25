/* prog 2 string scan str and scan character total occurance char
eg have a nie day 
enter a how many time a print 
print 3
*/

#include<iostream>
using namespace std;
int main(){
	char str[100], ch; 
	int len,count=0;;
	cout<<"\n Enter String :";
	gets(str);
	cout<<"\n String print : ";
	puts(str);
	len = strlen(str);
	cout<<"\n Length of String is :"<<len;
	
	cout<<"\n Enter Charater to Search :";
	cin>>ch;
	
	for(int i=0; i<len; i++)
	{

		if(str[i]==ch)
			count +=1;	
	}
	cout<<" total count :"<<count;
	return 0;
}