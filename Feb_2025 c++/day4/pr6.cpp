/* prog 2 string scan str and scan character total occurance char
eg have a nie day 
enter a how many time a print replace character
*/

#include<iostream>
using namespace std;
int main(){
	char str[100], ch, rp_ch; 
	int len, count=0 ;
	
	cout<<"\n Enter String :";
	gets(str);
	cout<<"\n String print : ";
	puts(str);
	len = strlen(str);
	cout<<"\n Length of String is :"<<len;
	
	cout<<"\n Enter Charater to Search :";
	cin>>ch;
	
	cout<<"\n Enter Replace Character :";
	cin>>rp_ch;
	
	// for inner if we dont have to declare var
	for(int i=0; i<len; i++)
	{
		int temp = str[i];
		if(temp==ch)
		{
			str[i]=rp_ch;
			count++;	
		}
		
	}
	cout<<" total count"<<count<<"\n After Replacement "<<endl;
	puts(str);
	return 0;
}