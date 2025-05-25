/* write print count number divisible by 5 between 1 to 100
*/

#include<iostream>
using namespace std;
main(){
	int count=0 , i=1;
	
	for(; i<=100; i++){
		
		if(i%5==0)
		count++;
	}
	cout<<"\nTotal Number divisible by 5 Between 1 to 100 is "<<count;
}