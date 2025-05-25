/* prog user define function
with return datatype used
without return void used
*/

#include<iostream>
using namespace std;

// without return
void message(){ // declaring function
	cout<<"hello my name is Functiuon \n";
}

// with return
int add(int a){
	a+=a;
	cout<<a;
	return 0;
}

int main(){
	cout<<"main running \n";
	message(); // calling
	cout<<"again main running \n"	;
	message();
	
	int a=2;
	add(a); // actual parameter
	return 0;
}