/* write a prog scan one hours and convert in min and sec
*/

#include<iostream>
using namespace std;
int main(){
	int hrs, min, sec;
	cout<<"Enter number :";
	cin>>hrs;
	cout<<hrs<<" hours\n";
	
	min = hrs * 60;
	sec = hrs * min * 60;
	
	cout<<"Minutes"<<min<<"\n";
	cout<<"Second"<<sec<<"\n";
	return 0;
}
	