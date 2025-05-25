#include<iostream>
#include<vector>
using namespace std;

int main(){
	// create vector dt 
	vector <int> v = {1,2,3,4,5,6,7,8,9};
	vector <int> v_even;
	vector <int> v_odd;

	for (int i : v) {
		if (i % 2 == 0) {
			v_even.push_back(i); 		
			} else {
			v_odd.push_back(i);   
		}
	}

	// Print even numbers
	cout << "Even : " << v_even.size() << endl;
	for (int i : v_even) {
		cout << "Even: " << i << endl;
	}

	// Print odd numbers
	cout << "Odd : " << v_odd.size() << endl;
	for (int i : v_odd) {
		cout << "Odd: " << i << endl;
	}

	return 0;
}
