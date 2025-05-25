#include<iostream>
/*
min and max with position 
read a number if found aray print position and number else say not found aray

*/
using namespace std;
int main()
{
    int a[]={17,8,30,1,18,8,21,6},index;
    int position=-1, key;
    cout<<"Enter number to find array: ";
    cin>>key;
    for(index=1;index<sizeof(a)/sizeof(a[0]) ;index++)
    {     
		 if(a[index]==key){
        	position=index;       	
		}
				
    }
	if(position =-1){
		cout<<"position not found ";
	}
	else
	cout<<"position "<<position<<"index is "<<index;
   
    return 0;
}