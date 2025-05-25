#include<iostream>
#include<iomanip>
using namespace std;
main(){
	int n=5;
	/*
	for(int i=0; i<n; i++){
		for(int i=0; i<n; i++){
			cout<<"X";
		}
		cout<<endl;
	}*/
    cout << "XXXXX";
    for (int i = 0; i <= 3; i++) {
        cout << "\nX" << setw(4) << "X";
    }
    cout << "\nXXXXX";
    
    cout<<"\npattern 2"<<endl;
    
 
    int i, j;
    cout << setw(6) << "X";
    for (i =5, j=2; i>0 && j<7; i--,j+=2) {
        cout <<endl<< setw(i) << "X" << setw(j) << "X";
       
    }
    cout <<endl <<" "<< setw(10)<<setfill('X')<<" " ;

    return 0;
}