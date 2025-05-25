/*create porg to access and modify array element return balance address
 in bank application diect access and modify account balance suing refrence returned by function
*/
#include<iostream>
using namespace std;

// int& this return address
int& Balance_access(int &ba){
return ba;
}


main(){
	int bal= 100000;
	int value;
	cout<<"Initial balance is "<<bal << endl;
	cout<<"Enter the index to update value: "<<endl;
	cin>>value;

	Balance_access(bal) = value;
	cout<<"After Modified by user the balance is "<<bal << endl;
	cout<<bal<<endl;
}