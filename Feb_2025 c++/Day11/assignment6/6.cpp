/*write prog intrest rate 3.5 amount deposeted bank ir pass parameter  calc simple intrest
*/
#include<iostream>
using namespace std;

// int& this return address
float Si(int pi,int y,float r=3.5){

return  (pi * y * r) / 100;
}


main(){
	int pi,y;
	cout<<"Enter principal Amount: "<<endl;
	cin>>pi;
	cout<<"Enter year taken to loan paid: "<<endl;
	cin>>y;

	cout<<"Enter principal Amount: "<<pi<<endl;
	cout<<"The area of Simple INTREST is: "<<Si(pi,y) <<endl;
	cout<<"Enter principal Amount: "<<pi<<endl;
	cout<<"The area of Simple INTREST is: "<<Si(pi,y,5) <<endl;
	
}