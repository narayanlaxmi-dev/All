/*write prog function calc area of rectangle where default value width is 5
*/
#include<iostream>
using namespace std;

// int& this return address
int areaRectangle(int l,int b=5){
return l*b;
}


main(){
	int length;
	cout<<"Enter Area of length: "<<endl;
	cin>>length;
	cout<<"The area of Rectange is: "<<areaRectangle(length) <<endl;
	// or
/*	int area=areaRectangle(length);
	cout<<"The area of Rectange is: "<<area<<endl;
*/
	
	cout<<"The area of Rectange is: "<<areaRectangle(length,2) <<endl;

}