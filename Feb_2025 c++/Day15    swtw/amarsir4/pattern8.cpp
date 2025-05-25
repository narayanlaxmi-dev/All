#include<iostream>
#include<iomanip>
using namespace std;
main(){

	int i, j;
	cout<<" "<<setw(6)<<setfill('*')<<"\n";
    for (i=0; i<=3; i++ ) {
    	cout<<"|"<<setw(5)<<setfill('-')<<"|"<<endl;
    	cout<<"|"<<setw(5)<<setfill('+')<<"|"<<endl;
		}
	cout<<" "<<setw(6)<<setfill('*')<<"\n";
	

    return 0;
}