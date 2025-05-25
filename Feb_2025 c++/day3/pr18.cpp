/* write prog  array STATIC int array, char arr, float arr
*/
#include<iostream>
using namespace std;
main(){
	int arr[5] = {12,45,34,78,9}, idx;
	char ch[5] = {'n', 'e', 'y', 'a', 'n'};
	float fl[5] = {12.12, 45.011, 3.45, 6.34, 76.4};
	cout<<"\nArray Static Value's\n";
	cout<<"\nArray Integer values\n";
	
	for(idx=0; idx<5; idx++){
		cout<< "array[" << idx <<"] = "<< arr[idx] << endl;
	}
	cout<<"\nArray Float values\n";
	
	for(idx=0; idx<5; idx++){		
		cout<< "array[" << idx <<"] = "<< fl[idx] << endl;
	}
	cout<<"\nArray Character values\n";
	
	for(idx=0; idx<5; idx++){	
		cout<< "array[" << idx <<"] = "<< ch[idx] << endl;
	}
}