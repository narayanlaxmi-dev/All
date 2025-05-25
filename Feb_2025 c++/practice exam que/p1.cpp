/*
 Write a c++ program to find volume of cylinder, cone and sphere. (Use function overloading)
 radius height pi 3.14159
 Cylinder = pr2h   pi * radius * radius * height; 
 Cone = pr2h/3 ---- pi * radius * radius * height) / 3;
 Sphere = 4/3pr3 --- (4.0 / 3) * pi * radius * radius * radius;
*/

#include<iostream>
#include<cmath>
using namespace std;

float pi = 3.14; // global declare
// cylinder
float volume(float r, float h) {
	return pi * r * r * h; 
}
// cone
float volume(float r, float h,bool t){
	return pi * r  * r * h / 3 ; 
}
// sphere
float volume(float r){
	return 4.0/3 * pi * r * r * r ; 
}

int main(){
	double radius, height;
	cout<<"\n Enter radius: ";
	cin>>radius;
	cout<<"\n Enter height: ";
	cin>>height;
	
	cout<< volume(radius , height) << endl;
	cout<< volume(radius , height,1) << endl;
	cout<< volume(radius)<< endl;
	return 0;
}