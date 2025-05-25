#include<iostream>
/*
array of size n
*/
using namespace std;
int main()
{
    int a[100],n,index;
   
    cout<<"Enter size:";
    cin>>n;
    cout<<"Enter "<<n<<" elements\n";
    for(index=0;index<n;index++)
    {
       cin>>a[index];
    }
   
    cout<<"\nEntered "<<n<<" elements are\n";
    for(index=0;index<n;index++)
    {
       cout<<a[index]<<"\n";
    }
    return 0;
}