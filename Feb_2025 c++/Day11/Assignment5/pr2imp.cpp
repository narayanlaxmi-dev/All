// WRITE C prog non repeation char in  string 
#include<iostream>
#include<string>

using namespace std;
int main()
{
    string line;
	
    int freq[256] = {0}; // all ASCII value store
    cout<<"Enter line:";
    getline(cin,line);
    
    	// for loop find occurance
    for(char ch :line)
        {
        	ch; // first char in string
        	freq[ch]++; // check character askii value count multiple time 	
        }
        
	 for(char ch :line){
        	if(freq[ch] == 1) //Find non repeating charcter....
        		{
        		cout<<ch<<" ";
				freq[ch]++;
				break;
				}	
        }
    
    // check condition repeat once
/*  for(int i = 0; i < 256; i++)
    {
        if(freq[i] == 1) //Find non repeating charcter's.....
        {
           cout<<" non occuring number are: "<<char(i)<<"  " ;
        }
    }
*/
    return 0;
}