#include<iostream>
/*
min and max with position 
read a number if found aray print position and number else say not found aray
*/
using namespace std;
int main()
{
    int a[]={17,8,30,1,18,8,21,6},index;
    int min,max,min_pos,max_pos;
    min=max=a[0];
    min_pos=max_pos=0;
    
    for(index=1;index<sizeof(a)/sizeof(a[0]) ;index++)
    {
    
       if(a[index]<min)
              {
               min=a[index];
               min_pos=index;
               
           }
        if(a[index]>max)
        {
            max=a[index];
               max_pos=index;
        }
		 	
    }

    cout<<"\nMax is:"<<max<<" at position:"<<max_pos;
    cout<<"\nMin is:"<<min<<" at position:"<<min_pos;
    return 0;
}