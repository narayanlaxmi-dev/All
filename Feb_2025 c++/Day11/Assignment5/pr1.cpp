// WRITE C prog count number of words in string 
#include<iostream>
#include<string>

using namespace std;
int main()
{
    string line;
	
    int count =0, vowels=0;
    cout<<"Enter line:";
    getline(cin,line);
    
    
    // for each loop
    for(char ch :line){
    	if(ch>='a' && ch<='z'){
    		
	    	if (ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o'|| ch== 'u' || ch== 'A' || ch== 'E' || ch== 'I'|| ch== 'O'||  ch== 'U')
				{
	            	vowels++;
				}
				else
				count++;
		}
	}
	
	
	// normal for loop 
/*    for(int i=0; line[i]!='\0'; i++)
        {
        	if(ch>='a' && ch<='z'){
	            if (line[i]== 'a' || line[i]== 'e' || line[i]== 'i' || line[i]== 'o'|| line[i]== 'u' || line[i]== 'A' || line[i]== 'E' || line[i]== 'I'|| line[i]== 'O'||  line[i]== 'U')
				{
	            	vowels++;
				}
				else
				count++;
			}
        }
*/
    cout<<"\nTotal vowels present in words are:"<<vowels;
    cout<<"\nTotal Non-Vowels/Consonant in words are:"<<count;
    return 0;
}