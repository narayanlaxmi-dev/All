//keep adding data to file
// copy original file  filename.txt to copy_filename.txt
#include <iostream>
#include<fstream>
using namespace std;
int main()
{
    string username, line;
    
	ifstream myfile("india.txt"); 
    ofstream  outfile("copy.txt");
    if(myfile && outfile){
		while(getline(myfile,line))
        {
        	outfile<<line;
        }
        myfile.close();
        outfile.close();

	}
	return 0;
}

 