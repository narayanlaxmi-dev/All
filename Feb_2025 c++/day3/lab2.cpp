/* write prog leap year 
ternary operator (condition) ? true stat : false stat ;
*/

#include<iostream>
using namespace std;
int main(){
	int year;
	cout<<"\nEnter to print ";
	cin >> year;
	(((year % 4 == 0 && year % 100 != 0)) || year % 400 == 0) ? cout<< "Leap year " : cout<<"Not Leap year ";
	
	
	return 0;
}