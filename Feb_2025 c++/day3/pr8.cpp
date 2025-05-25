/* write a prog scan 5 num and print max no
*/

#include<iostream>
using namespace std;

int main(){
	int i = 1, no, max = 0;
	cout<<"enter 5 number";
	
	while(i <= 5){
		cout<<"Enter number to check greater "<<i<<" =";
		cin>>no;
		
		if(no>max)
			max=no;
	i++;
	}
	
	cout<<"\nThe Largest number of five the number is "<<max;
	return 0;
}