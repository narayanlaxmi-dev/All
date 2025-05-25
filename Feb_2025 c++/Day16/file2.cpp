
#include<iostream>
#include<fstream>
using namespace std;
int main(){
	
	string line,n;
	cout<<"Enter name to create file";
	cin>>n;
	n= "C:/Users/cdac/Documents/Feb_2025/Day16"+n+".txt";
	cout<<"\nFile created "<<n;
	ofstream obj1(n);
	
	cout<<"\nCreate file success fully"<<endl;
	// write a file
	cout<<endl << "enter name:";
	cin>>line;
	obj1<<"name "<<line <<endl;
	cout<<endl << "enter gender:";
	cin>>line;
	obj1<<"name "<<line<<endl;
	cout<<endl << "enter email id:";
	cin>>line;
	obj1<<"name "<<line<<endl;
	
	
	obj1<<"\nname : narayan\ngender m \nemailid : narayanlaxmipatil@gmail.com";
	
	cout<<"\nClose file";
	obj1.close();
	

	return 0;
}