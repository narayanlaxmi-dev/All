/* write 2 matrix
*/


#include<iostream>
using namespace std;

 main() {
    int arr[2][2]= {{1,2},{2,4}} ;
	int arr2[2][2]= {{6,7},{8,9}} ;
	int r[2][2];
	
	cout<<"\n Additon of 2 array is ";
    for(int i = 0; i <= 1; i++) { 
    	for(int j=0; j<= 1; j++){
			r[i][j] = arr[i][j] + arr2[i][j];
			cout<<r[i][j]<<" ";
		}
	}
	
}


    


