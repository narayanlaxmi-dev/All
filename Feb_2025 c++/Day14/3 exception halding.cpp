// vote exceptiuon raised if age is below 18 flow read name age rase error can not vote

#include<iostream>
using namespace std;

int main()
{
	cout<<"\nstart";
	int age=0;
	string name;
	
	try
	{
		cout<<"\n --- vote eligible --- ";
		cout<<"\n Enter name: ";
		getline(cin, name);
		cout<<"\n Enter age: ";
		cin>>age;
		
		if (age<18)
			throw " error can not vote";
		
		
		
		cout<<"\n Welcome! name is: "<<name;
		cout<<"\n Age  is you can vote: "<<age ;
	}
	catch(const char *error)
	{
		cout<<"\nError is:"<<error;
	}
	
	cout<<"\n closing the code";
	return 0;
}

