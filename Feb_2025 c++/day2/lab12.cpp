/* write a prog calc electricity bill based on following condition
uptp 100 units 5per unit
101 to 300 7per unit
abouve 300 10per unit
*/

#include<iostream>
using namespace std;
int main(){
	float unit, unit1, unit2, unit3;
	cout<<"Enter Unit Bill =";
	cin>>unit;
	
	
	if(unit > 0 && unit <= 100){
		unit1 = unit * 5;
		cout<<"your Electricity Bill is ="<<unit1;
	}
	else if(unit >= 101 && unit <= 300){
		unit2 = 100 * 5  + (unit - 100) * 7 ;
		 cout<<"your Electricity Bill is ="<<unit2;
	}
	else if(unit > 300){
		unit3 = (100 * 5) + (200 * 7) + (unit - 300) * 10;
		cout<<"your Electricity Bill is ="<<unit3;
	}
	else{
		cout<<"NOT VALID";
	}
	
	return 0;
}
	