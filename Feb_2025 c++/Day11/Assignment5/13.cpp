/* write prog to count numer in word in sentence 
*/
#include<iostream>
#include<sstream>

using namespace std;
int main()
{
    string str, longstr,  word;
	cout<<"Enter Line :";
    getline(cin,str);
    
    int len = 0, count=0; 
    cout<<len;
    stringstream ss(str);
	
	
	while(ss >> word){// single word extract
		count++;	
	}
	cout<<"the string word present is: "<<count;
    return 0;
}



/*
#include<iostream>

using namespace std;

int main() {
    string str, word;
    cout << "Enter Line: ";
    getline(cin, str);
    
    int count = 0, len = str.length();
    bool inWord = false; // To track if we are inside a word or not
    
    for (int i = 0; i < len; i++) {
        if (str[i] != ' ' && !inWord) { 
            // If we encounter a non-space character and we are not already in a word
            inWord = true;
            count++; // Increment word count
        }
        else if (str[i] == ' ') {
            // If we encounter a space, we are no longer in a word
            inWord = false;
        }
    }

    cout << "The number of words present is: " << count << endl;
    return 0;
}
*/