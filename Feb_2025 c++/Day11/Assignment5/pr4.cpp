// WRITE C prog longest word count in string 
#include<iostream>
#include<sstream>

using namespace std;
int main()
{
    string line, longstr,  word;
	cout<<"Enter line:";
    getline(cin,line);
    
    int len = 0; 
    cout<<len;
    stringstream ss(line);
	
	
	while(ss >> word){
		if(word.length() > len){
			len = word.length();
			longstr = word;
		}
	}
	cout<<longstr;
    return 0;
}