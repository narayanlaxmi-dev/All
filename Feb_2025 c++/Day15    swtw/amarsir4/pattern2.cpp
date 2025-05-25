#include<iostream>
#include<iomanip>
using namespace std;
main(){
	int i, j, n=5;
    for (i = 1; i <= n; ++i) {
        for (j=1; j<= n; ++j) { 
            if (i == (n/2) + 1 || j == (n/2) + 1) 
                cout << setw(2) << "+"; 
             else 
                cout << setw(2) << " "; 
        }
        cout<<endl; 
    }
    return 0;
}

