/* write prog swap value CALL BY VALUE interchange Real Value Can't Change
*/
#include<iostream>
using namespace std;
void swap(int x, int y){ // call by value 
	int t = x;
	x = y ;
	y = t;
	cout<<"\nThe call by value after swap  a = "<<x<<" and b = "<<y<<endl;
	printf("Address %d, %d", &x, &y);
}
void fn(int &x, int &y){
	int t = x;
	x = y;
	y = t;
	cout<<"\nThe Address by value after swap  a = "<<x<<" and b = "<<y<<endl;
	printf("Address %d, %d", &x, &y);
}

main(){
	int var1,var2;
	cout<<"Enter two number";
	cin>>var1>>var2;
	cout<<"The value before swap a = "<<var1<<" and b = "<<var2;
	printf("\nAddress %d, %d", &var1, &var2);
	swap(var1,var2);
	fn(var1,var2);
	
}