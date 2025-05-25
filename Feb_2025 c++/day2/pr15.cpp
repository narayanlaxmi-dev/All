/* write a prog menu driven
scan char print char is vowels or not
*/

#include<iostream>
using namespace std;
int main(){
	char ch;
	cout<<"Enter Character for vowels find :";

	cin>>ch;
	switch(tolower(ch)){   // if i remove tolower() then upper case use down line code
		case 'a': 
				cout<<"Vowels ";
				break;
		case 'e': 
				cout<<"Vowels ";
				break ; 
		case 'i': 
				cout<<"Vowels ";
				break ; 
		case 'o': 
				cout<<"Vowels ";
				break ; 
		case 'u': 
				cout<<"Vowels ";
				break ; 
		
/*		case 'A': 
				cout<<"Vowels ";
				break;
		case 'E': 
				cout<<"Vowels ";
				break ; 
		case 'I': 
				cout<<"Vowels ";
				break ; 
		case 'O': 
				cout<<"Vowels ";
				break ; 
		case 'U': 
				cout<<"Vowels ";
				break ; 
*/
		default : "Not a vowels" ;
	}
	return 0;
}
	