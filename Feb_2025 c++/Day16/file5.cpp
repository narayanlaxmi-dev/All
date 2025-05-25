//keep adding data to file
// create file user name if not already there
// keep adding new line by user with >>> symbol per entry
// stop when user given EXIT 
#include <iostream>
#include<fstream>
using namespace std;
int main()
{
    string username, line;
    cout<<"enter name";
    cin>>username;

    ofstream myfile(username+".txt",ios::app); // append  create file then add time to time
    
    if(myfile.is_open())//if opened without error
    {     
        while(1)
		{
			cout<<"Enter line : press 0 (exit) :";
			getline(cin, line);
        	 	if (line == "0")
				 {
        	 		cout<<"exiting...";
        	 		break; // exit(0)
				 }
				 else
        		myfile << "\n>>>" << line;
		}
		myfile.close();
    }
    else
        cout<<"Error in opening file";
    return 0;
}

 