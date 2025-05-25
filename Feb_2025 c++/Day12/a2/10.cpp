#include<iostream>
// read array reaturn and minimum array 
using namespace std;
void print_array(int x[], int n )
{
    for(int i=0; i<= n  ;i++)
    {
        cout<<"\n@"<<i<<" we have "<<x[i];
    }
}

int min_array(int x[], int n )
{	
int min=x[0];
	for(int i=0; i<= n  ;i++)
    {
        if(x[i]< min){
        	min = x[i];        	
		}     
    }
    return min;
}
int main()
{
    int a[6]={10,20,30,40,5,60};
    min_array(a,6);
    print_array(a, 6);
    cout<<"\n Min array is: "<<min_array(a,6);
    return 0;
   
   
}