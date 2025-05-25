// write a prog to scan & print square and cube/ per sq find cube
#include<iostream>
using namespace std;
main(){
	int no,sq=0,cube=0;
	cout<<"\nEnter Number :";
	cin>>no;
	sq=no*no;
	cout<<"\nSquare is = "<<sq;
	cube=no*no*no;
	cout<<"\nCube is = "<<cube;
	cube=sq*sq*sq;
	cout<<"\nSquare value Cube is = "<<cube;
}