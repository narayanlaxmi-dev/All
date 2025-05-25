#include<iostream>
using namespace std;
/* code min function whichi will return min of two number
recursion calc of sum or n 5+4+3+2+1 = answer
*/
int sumfunc(int n)
{
    if(n == 0)
        return 0;
    else
        return n + sumfunc(n - 1); // sum n + (n-1) + ... + 1
        //return n * sumfunc(n - 1); // factorial code 
        
		
/*		int sum=0 ;
        for(int i=1; i<=n; i++){
        	sum =sum + i;       
		}
		return sum;
*/
}

int main()
{   
    int no;
    cout<<"\n Enter number : ";
    cin>>no;
    cout <<" the sum of "<<no<<" is: "<< sumfunc(no);
 	
    return 0;
}