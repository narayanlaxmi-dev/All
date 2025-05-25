/* write print Palindrome number
*/

#include<iostream>
using namespace std;
main(){
	int number, compare ,rev=0;
	cout<<"Enter Numbers to check Palindrome :";
	cin>>number;
	compare = number;

	for(; number > 0; ){
		rev = rev *10 + (number % 10);
		number = number / 10;
	}

	if(rev==compare)
	cout<<"Number "<<rev<<" is Palindrome ";
	else 
	cout<<"Number "<<rev<<" Not Palindrome ";
	
}