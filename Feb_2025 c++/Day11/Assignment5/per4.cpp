// WRITE C prog remove duplicate in string 
#include<iostream>
#include<string>

using namespace std;
int main()
{
    string line;
	
    int freq[256] = {0}; 
    cout<<"Enter line:";
    getline(cin,line);
    
    	// for loop occurance
    for(char ch :line)
        {
        	freq[ch]++;
        }
        
	cout << "Characters REPEATED remove: ";
	char array[100];
	int i=0;
    for (char ch : line)
    {
        if (freq[ch] == 1)
        {
            array[i] = ch;
            cout<<" "<<array[i];
			i++;
        }
        array[i] = '\0'; // garbage termination
    }
	
	
    return 0;
}