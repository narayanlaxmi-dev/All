#include<iostream>
#include<iomanip>
using namespace std;
main(){
	int n=5;
	int i, j;

    for (i=2; i<=8; i++ ) {
    	cout<<endl<<setw(i)<<"x";
    }
	
	for (i=8; i>=2; i-- ) {
    	cout<<endl<<setw(i)<<"x";
    }

    return 0;
}