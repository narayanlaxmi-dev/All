#include<iostream>
/*
min and max with position 
read a number if found aray print position and number else say not found aray
find frequency in given key
*/
using namespace std;
int main()
{
    int a[]={17,8,30,1,1,18,8,21,6},index;
    int key, count=0;
    cout<<"Enter number to find array: ";
    cin>>key;
    for(index=1;index<sizeof(a)/sizeof(a[0]) ;index++)
    {      
		 if(a[index]==key)
		{
        	count++;    	
		}
				
    }
	
	cout<<"\n number "<<key<<" repeated is "<<count;
   
    return 0;
}