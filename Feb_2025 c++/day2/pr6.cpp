/* write a prog which student marksheet 3 sub 
rollNo
name
cpp
java
dbms
total
percentage
Afer if else prog 12 file this grade used
Grade per>=75 A
per>=60 B
per>=50 C
*/
#include<iostream>
using namespace std;
int main(){
	int rollNo ,cpp , java, dbms, total;
	char name[20];
	char grade;
	float percentage;
	
	cout<<"Enter Name :";
	gets(name);
	cout<<"\nEnter RollNo ";
	cin>>rollNo;
	cout<<"Enter marks for cpp ";
	cin>>cpp;
	cout<<"Enter marks for java ";
	cin>>java;
	cout<<"Enter marks for dbms ";
	cin>>dbms;
	
	total = cpp+java+dbms;
	percentage =total/(3);
	
	if(percentage >= 75)
		grade ='A';
		else 
			if(percentage >= 60)
				grade ='B';
				else
					if(percentage >= 50)
						grade ='C';
						else 
							grade ='F';
	
	cout<<"\nEnter Name "<<name;
	cout<<"\nEnter Roll no "<<rollNo;
	cout<<"\nEnter marks for cpp "<<cpp;
	cout<<"\nEnter marks for java "<<java;
	cout<<"\nEnter marks for dbms "<<dbms;
	cout<<"\nTotal marks "<<total<<endl;
	cout<<"\nPercentage marks "<<percentage;
	cout<<"\nGrade "<<grade;
 return 0;	
}
	