/*
create class name programming whilecreating obj if onthis is pass the print pessage i love programming laguage
if substring is pass then programming language the name of that string variable printed 
for ex if cpp pass the i love cpp is printed 
*/

#include<iostream>
using namespace std;

class programming{
	private:
		char string[30];
		
	public:		
		programming(){
			cout<<"\nI love Programming languages";
		}
		programming(const char s[30]){
			strcpy(string , s);
			cout<<"\nI love "<<s;
		}	
};

main(){
	char ss[40];
	programming object;
	cout<<"\nEnter string ";
	cin>>ss;
	
	programming object1(ss);
	programming object12("My Self");
}