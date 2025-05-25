/* prog user scan num menu driven
1 for even 
2 for largest number
*/

#include<iostream>
using namespace std;

void fact(int a){	
	int fa=1, temp;
	temp=a;
	while(a>0){
		fa=fa*a;
		a--;
	}
	cout<<"Factorial of "<<temp<<" is "<<fa;
}

int main(){

	int ch;
	cout<<"Enter Factorial to display output";
	cin>>ch;
	fact(ch);
	
	return 0;
}