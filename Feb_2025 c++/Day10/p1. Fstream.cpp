//  File handeling 

#include<iostream>
// for class fstream ifstream ofstream 
#include<fstream>

using namespace std;

main(){
	// file create using fstream class 
	ofstream finobj("1file.txt");
	
	// getline used to read line 
	string s;
	
	// data write in file
	finobj<<"\n Rollno \t name"<< endl;
	finobj<<"\n 01 \t\t narayan"<< endl;
	finobj<<" 02 \t\t ne"<< endl;
	finobj<<" 03	"<< endl;
	
	
	cout<<"\n file created..."<<endl;
	
	ifstream out("1file.txt"); // open existing file
	finobj<<"\n Enter String..........."<<endl;
	
	// user take input multiple times
	do{
		cout<<"\n\tEnter String ";
		// user input string
		getline(cin, s);
		
		cout<<"\nEnter x to exit: ";
		
		if(s =="X" || s=="x")
			break;
		
		// store values in file used ofstream object print
		finobj<< s <<"\n";
		cout<<"\nThe string you enter is: "<<s;
	}while(1);
	
	
	
	cout<<"\n file saved....";
	finobj.close(); // file close 
}