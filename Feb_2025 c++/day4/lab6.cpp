/* write print reverse number
*/

#include<iostream>
using namespace std;
main(){
	int number, rev=0;
	cout<<"Enter Number";
	cin>>number;

//	(int i = number; number > 0; i++)
	for(; number > 0; ){
		rev=rev*10 + (number % 10);
		number = number / 10;
		
	}
	cout<<rev;
}