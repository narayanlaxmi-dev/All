/* Write a prog scan no and find range 
scan no between 1-500
print 1-250
print 251-500
print not range in 1-500
*/

#include<iostream>
using namespace std;
int main(){
	int no;
	cout<<"\nEnter Number :";
	cin>>no;
	
//	if(no >= 1 && no <= 500)
		if(no >= 1 && no <= 250)
			cout<<"\n print 1 - to - 250";
		else 	
			if(no >= 251 && no <= 500)
				cout<<"\nprint 251 - to - 500";		
				else
					cout<<"\n print not available range in 1-500 :";
//					else cout<<"\n print not available range in 1-500 :";
}
	