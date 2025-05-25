/* wWrite a prog 2 no and print largst no
*/

#include<iostream>
using namespace std;
int main(){
	int var1,var2,var3;
	cout<<"\nEnter Two Number :";
	cin>>var1>>var2>>var3;
	
	if(var1 > var2 && var1 > var3)
		cout<<"\n Number one Greater :"<<var1;
		else 	
			if(var2 > var1 && var2 > var3)
				cout<<"\n Number two Greater :"<<var2;
				else
					cout<<"\n Number three Greater :"<<var3;
 return 0;	
}
	