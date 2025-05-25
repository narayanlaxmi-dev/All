/* write a prog scan year and convert in day and month
*/

#include<iostream>
using namespace std;
int main(){
	float year, day, month;
	cout << "Enter number :";
	cin >> year;
	day = year * 365;
	cout << "Day is :" << day << "\n";
	
	month = year * 12;
	cout<< "Month is :" << month << "\n";
	return 0;
}
	