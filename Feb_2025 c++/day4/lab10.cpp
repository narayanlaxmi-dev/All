/* write print amstrong 

*/

#include<iostream>
#include<cmath>
using namespace std;
main(){
		
	 int num, digit, pwr=0, sum = 0;
	 cout<<"Enter number to find Armstrong";
	 cin>>num;
	 
	for(int i=num; i>0; i=i/10){
	 	pwr += 1;
	}
	for(int i=num; i>0; i=i/10){
		 digit=i%10;
		 sum=sum+pow(digit,pwr);
	}

		if(sum==num)
		 	cout<<"Armstrong";
		else
			cout<<"Not Armstrong";
	
}