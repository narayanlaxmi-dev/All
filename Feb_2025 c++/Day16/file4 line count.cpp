//reading created file
//reading created file
#include <iostream>
#include<fstream>
using namespace std;
int main()
{
    string line;
    int lines=0, words=0, character=0;
    cout<<"\nEnter name:";
    cin>>line;
    line= "C:/Users/cdac/Documents/Feb_2025/Day16"	+ line +	".txt";
    ifstream myfile(line);
    if(myfile.is_open())//if opened without error
    {
        while(getline(myfile,line))
        {
            cout<<"\nRead Line:"<<line;
        }
        for(int i=0; line[i]!='\0'; i++){
        	char c= line[i];
        	if(c=='.')
        		lines++;
        	if(c==' ')
        		words++;
        		character++;
        	
		}
        
        myfile.close();
    }
    else
        cout<<"Error in opening file";
    return 0;
}