/* write print even Fibonacci
*/

#include<iostream>
using namespace std;
main(){
		int  sum=0, a=1,b=2, next;
		
		while(b < 4000000){
			next = a+b;
			a = b;
			b = next;
			if(a % 2 == 0 )
				sum += a;
		}
	cout<<"fibo even "<<sum;
	 
	
}