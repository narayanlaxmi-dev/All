/* write a prog scan str copy into another string 
create your own function
call by value function calc length
call by refrence functuin calc length
*/
#include<iostream>
using namespace std;

// call by value
void mycpy(char cpy[], char s[]){
	int i=0, j=0;
	while(s[i] != '\0'){
		cpy[j] = s[i];
		i++;
		j++;	
	}	
	cpy[j] = '\0'; // termination garbate value till 50
}

// call by Refrence
void mycpy1(char *cpy, char *str){
	int i=0, j=0;
	while(*str != '\0'){
		*cpy = *str;
		i++;
		str++;	
		j++;
		cpy++;
	}	
	cpy[j] = '\0'; // termination garbate value till 50
}


main(){
	
	char str[50], cpy[50], cpy1[50];
	cout<<"Enter string to check length: ";
	cin>>str;
	cout<<"\n You enter: "<<str;
	
	mycpy(cpy1, str);
	mycpy1(cpy, str);

    cout << "\nCopied string: " << cpy << endl;
	cout << "\nCopied refrence string: " << cpy1 << endl;
}