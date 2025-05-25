/* write print multiple of 3 or 5 t0  add to 
*/

#include<iostream>
using namespace std;
main(){
	int sum=0, count=0, i=1;
	
	for(; i<=1000; i++){
		
		if(i%3==0 || i%5==0){
		sum += i;
		count++;
		}
	}
	cout<<"the sum of all multiple of 3 or 5 is "<<sum<<"\n the count is "<<count ;
}