/* write  prog anagrams 
str = "silent";
str1 = "listen";
compare this two string each word present other string
*/
#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	string s1, s2;
	cout<<"Enter string 1";
	getline(cin, s1);
	cout<<"Enter string 2";
	getline(cin, s2);
	// shorting function in ascending 
	sort(s1.begin(),s1.end());
	sort(s2.begin(),s2.end());
	
	// compare both string 
	// for loop to 1 string compare
	for(int i=0; i<='\0'; i++ ){
		// for loop to 2 string compare
		for(int j=0; j<='\0'; j++){
			// check equal or not
			if(s1==s2){
			cout<<"String are anagram";
			}		
			else{
				cout<<"String are NOT anagram";
			}
		}
	}
	return 0;
}
