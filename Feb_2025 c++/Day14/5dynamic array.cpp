//create array of 10 elements ,store data and print them back
//using pointer
#include<iostream>
#include<memory>
using namespace std;

int main()
{
	// give  memory to p for array
	int *p=new int[10];
    for(int i=0;i<10;i++)
    {
    	cout<<"\nEnter element at:"<<i<<":";
    	cin>>*(p+i);
	}
	
	
	for(int i=9;i>=0; i--)
    {
    	cout<<*(p+i)<<" , ";
	}
	
	cout<<"\nEntered elements are:\n";
	for(int i=0;i<10;i++)
    {
    	cout<<*(p+i)<<" , ";
	}
	return 0;
}
