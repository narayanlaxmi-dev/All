/* write prog take num 1-12 and print correspondin month name
*/

#include<iostream>
using namespace std;
int main(){
	int choice;
	cout<<"\nEnter month to print ";
	cin >> choice;
	switch(choice){
		
		case 1 : cout<<"you enter this no "<<choice<<" so name of month is January" ;
			break;
		case 2 : cout<<"you enter this no "<<choice<<" so name of month is February" ;
			break;
		case 3 : cout<<"you enter this no "<<choice<<" so name of month is March" ;
			break;
		case 4 : cout<<"you enter this no "<<choice<<" so name of month is April" ;
			break;
		case 5 : cout<<"you enter this no "<<choice<<" so name of month is May" ;
			break;
		case 6 : cout<<"you enter this no "<<choice<<" so name of month is June" ;
			break;
		case 7 : cout<<"you enter this no "<<choice<<" so name of month is July" ;
			break;
		case 8 : cout<<"you enter this no "<<choice<<" so name of month is August" ;
			break;
		case 9 : cout<<"you enter this no "<<choice<<" so name of month is September" ;
			break;
		case 10 : cout<<"you enter this no "<<choice<<" so name of month is Octomber" ;
			break;
		case 11 : cout<<"you enter this no "<<choice<<" so name of month is November" ;
			break;
		case 12 :cout<<"you enter this no "<<choice<<" so name of month is December" ;
			break;
		default : cout<<"INVALID PARAMETER ENTER....";
	}
	
	return 0;
}