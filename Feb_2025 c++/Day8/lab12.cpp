/* write a prog toremove duplicate element 

*/
#include<iostream>
using namespace std;

 main() {
    int  arr[7]= {1,2,2,3,5,5,6}, i=0;
	int ans[7], j=0;
		for(i=0; i<7; i++){
			
			if(arr[i] != arr[i-1] || i==0){
				ans[j] = arr[i];
				j++;
			}		
		}
		
		cout<<"\n sorted array total without duplicate is: "<<j<<endl ;
		for(i=0; i<j; i++){
			cout<<" "<<ans[i];
		}
	}