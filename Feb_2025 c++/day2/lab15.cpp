/* write a prog basic grading systen by adding then 
a distinction for std whose score 90 above
fail for scoring below 40
a conditional check the marks enterwed btw 0 to 100

*/

#include<iostream>
using namespace std;
int main(){
	int marks;
	cout<<"Enter Marks";
	cin>>marks;
	
	if(marks>0 && marks <=100){
		if(marks >=  90)
			cout<<"First class pass";
		else 
			if(marks >= 60)
			cout<<"Second class pass";
				else
					if(marks >= 40)
					cout<<"Third class pass";
					else
						if(marks < 40)
						cout<<"Fail";
	}
	else {
		cout<<"NOT VALID";
	}
	
	return 0;
}
	