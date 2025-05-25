/* write prog scan myContact file
 */
#include<iostream>
#include<fstream>
using namespace std;

main(){
	
	ofstream write("myContact.txt");
	
	string number, name;
	cout<<"\n Enter name and number: ";
	cin>>name>>number;
	write<<"\n Name: "<< name<< "\n Contact: "<< number;
	write.close();
	
	ifstream read("myContact.txt");
//	read>>name>>number; // read file for  myContact
	cout<<"Name: "<<name<<"\nNumber: "<<number; // i read directy to user  
	read.close();
}