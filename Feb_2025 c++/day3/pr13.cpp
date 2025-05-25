/* write a prog prime num


*/

#include<iostream>
using namespace std;

int main(){
	int num, i=2, flag = 1;
	
	cout<<"Enter number to check prime or not";
	cin>>num;
	
	while(i<num){
		
		if(num % i == 0)
			flag=0;
	i++;
	}
	if(flag == 1)
	cout<<"Prime";
	else
	cout<<"not prime";
	return 0;
}