/* prog user scan num menu driven
1 for even 
2 for largest number
*/

#include<iostream>
using namespace std;

void oddeven(int x){	
	
	if(x%2==0)
		cout<<"Number is "<<x<<"Even number\n";
	else
		cout<<"Number is "<<x<<"Odd number\n";

}

void largest(int a,int b){	
	if(a>b)
	cout<<"a="<<a<<" is larger";
	else
	cout<<"b="<<b<<" is larger";
}

int main(){

	int ch  ;
	cout<<"Enter choice to 1 (Odd/Even) ,2 (largest number)";
	cin>>ch;
	
	
	while(1){
		switch(ch){
			case 1:
				int number ;
				cout<<"Enter number to odd/Even";
				cin>>number;
				oddeven(number);
				break;
		case 2: 
				int a,b;
				cout<<"Enter 2 number to check larger ";
				cin>>a>>b;
				largest(a,b);
				break;
		default : cout<<"INVALID NUMBER ENTERED....";
			
		}
		
		cout<<"Press 0 to exit";
		if(ch==0)
			break;
	}
	return 0;	
}
		
		
		
	
	
	
	
	
	
	
