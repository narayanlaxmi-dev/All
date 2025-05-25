
// 404 file not found
#include<iostream>
using namespace std;

int main()
{
	cout<<"\nstart";
	int a=10,b=0;
	try
	{
		
		if (b==0)
			throw "Div by zero Not Possible";
		
		int c=a/b;
	
		cout<<"\noperate";
		cout<<"\nAnswer is:"<<c;
	}
	catch(const char *error)
	{
		cout<<"\nError is:"<<error;
	}
	
	cout<<"\n closing the code";
	return 0;
}

