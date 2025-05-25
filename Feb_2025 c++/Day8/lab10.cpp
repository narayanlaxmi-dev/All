/* write 2 array element check array equal
*/


#include<iostream>
using namespace std;

 main() {
    static int  arr1[6]= {1,2,3,4,5,6}, arr2[6] = {1,2,3,4,5,6} , flag=0;
		int size = sizeof(arr1)  /  sizeof(arr1[0]);
		cout<<"\nthe is of array 1 is: "<<size;
	
		int size1 = sizeof(arr2)  /  sizeof(arr2[0]);
		cout<<"\nthe is of array 2 is: "<<size1;

    for(int i = 0; i < 6; i++) { 
   	
			if(arr1[i] == arr2[i]){
				flag ++;
			}
			else{
				flag = 0;
			}
	}
		if(flag == 6){
			cout<<"\n Equal";
		}
		else{
			cout<<" \n Not Equal";
		}	
}