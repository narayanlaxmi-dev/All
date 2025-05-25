// write a prog print 10 times 1 to 10 and 10 to 1

#include<iostream>
using namespace std;

int main(){
	int var1 = 1;
	cout<<"Series 1....10\n";
	while(var1 <= 10){
		cout <<var1<<"\n";
		var1 ++;
	}
	
	var1 = 10;
	cout<<"\nSeries 10....1\n";
	while(var1 >= 1){
		cout<<var1<<"\n";
		var1 --;
	}
	return 0;
}