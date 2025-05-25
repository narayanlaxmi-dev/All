/* write a prog scan age of person and print person is minor major or senior citizen
*/

#include<iostream>
using namespace std;
int main(){
	int age, minor ,major, senior;
	cout<<"Enter age :";
	cin>>age;
	
	if(age >= 0 && age < 18)
		cout<<"minor citizen";
	else if(age >= 18) 
			cout<<"major citizen";
			else if(age >= 60) 
			cout<<"senior citizen";
				else 
					cout<<"NOT VALID";
	return 0;
}
	