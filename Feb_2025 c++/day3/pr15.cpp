/* write a prog for loop
*/

#include<iostream>
using namespace std;

int main(){
	int num,i;
	cout<<"Enter number to print series ";
	cin>>num;
	cout<<"\nAscending";
	
	for( i= 1; i <= num; i++)
	{
		cout<<"\n"<<i;
	}
	cout<<"\nDescending";
	for(i = num; i>= 1; i--){
		cout<<"\n"<<i;
	}
	return 0;
}