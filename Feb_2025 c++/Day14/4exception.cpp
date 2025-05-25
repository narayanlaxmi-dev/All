// vote exceptiuon raised if age is below 18 flow read name age rase error can not vote
/*
java que techmeh rase exception in given number <0 -ve exception 
rase exception in given number >100 +ve exception 
any thing else default
*/
#include<iostream>
using namespace std;

int main()
{	cout<<"\nstart";
	int n=0;	
	try
	{
		cout<<"\n Enter number: ";
		cin>>n;
		
		if (n<0)
			throw " -ve error";
		
		else if (n>100)
			throw " +ve error";

		cout<<"number in range"<<n;
	}
	
	catch(const char *error)
		{
		cout<<"\nError is:"<<error;
		}

	catch(...){
		cout<<"Default Exception "<<endl;
	}
	
	cout<<"\n closing the code";
	return 0;
}

