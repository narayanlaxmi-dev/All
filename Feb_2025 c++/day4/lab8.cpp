/* write print palindrome 3 digit start 100 ++ end 999 less
*/

#include<iostream>
using namespace std;
main(){
		
	int  largest_no=0 ;

	for(int i=999; i>=100; i--){ // i =999
		for(int j=i; j>=100; j--){ // j 999 - 998 - 997.....
			int number=i*j;

			int org_num = number ;
			int rev=0;
			
				for(; org_num > 0; ){
				rev = rev * 10 + (org_num % 10);
				org_num = org_num / 10;
				}
					if(rev == number && number > largest_no){
						largest_no = number;
					}
		}
	}
	
	cout<<"Largest Number into 3 digit "<< largest_no <<" is Palindrome ";
	 
	
}