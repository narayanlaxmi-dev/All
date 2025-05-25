/* write all leap years between 2000 to 2024
*/

#include<iostream>
using namespace std;
main(){
	int year, i, count = 0;
//	cout<<"Enter year to check leap year or not :";
//	cin>>year;
	
	for(year=2000; year <=2024; year++){
		
	(((year % 4 == 0 && year % 100 != 0)) || year % 400 == 0) ? cout<<year<<endl,count++ : 0;
		
	}
	
}