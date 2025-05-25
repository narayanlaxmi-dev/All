#include<iostream>
using namespace std;

void multiplication(int n){ // formal parameter or argument
	for(int i=1; i<=10; i++){
		cout<<" "<< n << " + " << i << " = " <<(i*n)<<" \n";
	}
}

void oneToFive(){
	for (int i = 1; i <= 5; i++) { // outer loop for 1 to 5 table
        cout << "Multiplication Table for " << i << ":\n";

        // Print the table for each num
        for (int j = 1; j <= 10; j++) {
            cout << i << " x " << j << " = " << i * j << endl;
        }

        // Add empty line tables for better readability
        cout << endl;
    }
}

main(){
	int number;
	cout<<"Enter number to print n number of tabe ";
	cin>>number;
	multiplication(number); // actual parameter
	
	oneToFive();
}