/* write square print 1 to 5
*/

#include<iostream>
using namespace std;
main(){
	int num=1, i=1;
	
	cout<<"Print Square 1 - to - 5 :\n";
	for(; i<=5; i++){
		num = i*i;
		cout<<"Square is "<<num<<endl;
	}
	
}