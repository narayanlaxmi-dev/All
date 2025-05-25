/* write a prog scan no 5   check 
the sum of even no 
and odd numbers
and print total odd no and even no
*/

#include<iostream>
using namespace std;

int main(){
	int i = 1, no, even_no = 0, even_count = 0, odd_no = 0, odd_count = 0 ;
	cout<<"enter 5 number";
	
	while(i <= 5){
		cout<<"enter to scan number "<<i<<" =";
		cin>>no;
		
		// even num
		if(no % 2== 0){
			// even add
			even_no = even_no + no;  //even_no += no; 
			even_count++;			
		}
		else{	
			odd_no += no;
			odd_count++;
		}
	i++;
	}
	cout<<"\nTotal Even number "<< even_count ;
	cout<<"\nThe sum even no is "<<even_no;
	cout<<"\nTotal odd number "<< odd_count ;
	cout<<"\nThe sum odd no is "<<odd_no;
	
	
	return 0;
}