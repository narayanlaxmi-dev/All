/* write a prog to get diff b/t larsest ans smallest valuein array
*/
#include<iostream>
using namespace std;

 main() {
    int  arr[6]= {41,2,3,4,5,6}; 
    int i=0 , largest = arr[0], smallest = arr[0];
	
		for(i=0; i<6; i++){
			
			if(arr[i] > largest){
				largest = arr[i];
			}
			if(arr[i] < smallest){
				smallest = arr[i];
			}
		}
		cout<<"\n largest "<<largest;
		cout<<"\n smallest "<<smallest;
	}