/* write a prog take 3 side triangle as input and determine if trigangle
equilateral  all side same
isosceles 2 side 
scalene all side diff

*/

#include<iostream>
using namespace std;
int main(){
	int s1, s2, s3;
	cout << "Enter Three Number";
	cin>> s1 >> s2 >> s3;
	if((s1+s2) >s3 && (s1+s3) >s2 && (s3+s2) >s1){
		
		if(s1==s2 && s1 == s3)
			cout<<"All Side Equal";
			else
				if(s1==s2 && s1!=s3  || s1==s3  && s1!=s2 || s2==s3 && s2!=s1)
					cout<<"Only Two sides are Equal";
					else 
						if(s1!=s2 && s2!=s3 && s1!=s3)
						cout<<"All sides are different";
		}
	else 
		cout<<"Not valid Number...";
	
	return 0;
}
	