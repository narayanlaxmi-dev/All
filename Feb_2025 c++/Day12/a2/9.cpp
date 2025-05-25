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

void double_array(int x[], int n )
{
	cout<<"Double array: ";
    for(int i=0; i<= n  ;i++)
    {
        x[i]=x[i]*2;
    }
}
int main()
{
    int a[6]={10,20,30,40,50,60};
    double_array(a,6);
    print_array(a, 6);
    return 0;
   
   
}