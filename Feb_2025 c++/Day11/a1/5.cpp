#include<iostream>
/* clockwise
min and max with position 
n=3 a[11,22,33,44,55]
[22,33,44,55,11] ,[33,---22]
*/
using namespace std;
int main()
{
    int a[]={11,22,33,44,55}, i;
    int rotation,n, count;
    cout<<"Enter number to rotate: ";
    cin>>rotation;
    
    
    
    while(rotation>0)
	{
    	int temp = a[0]; //1
		
		for(i=0;  i< (sizeof(a)/sizeof(a[0]))-1;  i++){ // 2 
			a[i]= a[i+1];
		
		}		
			a[(sizeof(a)/sizeof(a[0])) -1] = temp; //3
		
		// printing for loop
		for(i=0;  i< (sizeof(a)/sizeof(a[0]));  i++)
	    {      
		cout<<a[i]<<", ";			
	    }
	    cout<<"\n";
	    rotation--;
	}
	

		
    
    return 0;
}