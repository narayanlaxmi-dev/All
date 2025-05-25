/* prog user scan 2 num addition 
*/

#include<iostream>
using namespace std;

void addw(int z,int x){ 
	int c = z+x;
	cout<<c;
}

int addo(int a,int b){
	return a+b;
}

int main(){
	int a,b;
	cout<<"Enter 2 number for addition :";
	cin>>a>>b;
	
	
//	cout<< "with return " << addo(a,b) << "\n";
	int add = addo(a,b);
	cout<< "with return " << add << "\n";
	
	cout<<"without return ";
	addw(a,b);
	return 0;
}