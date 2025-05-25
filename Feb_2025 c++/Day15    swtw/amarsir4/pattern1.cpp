#include<iostream>
#include<iomanip>
// me nlp
using namespace std;
main(){

	int i, j;

    for (i=3,j=9; i<=8 && j>=2; i++,j-=2 ) {
    	cout << endl << setw(i) <<"x" <<setw(j) <<"*";
    }
	
	 
    for (i = 7, j = 1; i >= 2 && j <= 8; i--, j += 2) {
        cout << endl << setw(i) << "x" << setw(j) << "*";
    }


    return 0;
}

