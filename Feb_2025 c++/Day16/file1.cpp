#include<iostream>
#include<fstream>
using namespace std;
int main(){
	string line;
	// create a file
	ofstream obj1("myinfo.txt");
	
	cout<<"Create file success fully";
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