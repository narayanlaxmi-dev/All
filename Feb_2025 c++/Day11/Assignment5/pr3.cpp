// WRITE C prog char occurance in each character in string 
#include<iostream>
#include<string>

using namespace std;
int main()
{
    string line;
	
    int freq[256] = {0}; 
    cout<<"Enter line:";
    getline(cin,line);
    
    	// for loop find occurance
    for(char ch :line)
        {
        	freq[ch]++;
        }
        
	 cout << "Characters that appear more than once: ";
    for (char ch : line)
    {
        if (freq[ch] > 0)
        {
            cout << ch<<" :- occur "<<freq[ch]<<": times"<<endl;
        }
    }

    return 0;
}