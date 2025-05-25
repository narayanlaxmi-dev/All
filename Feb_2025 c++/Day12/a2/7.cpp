#include<iostream>
using namespace std;
void swap_by_value(int no1,int no2)//pass by value:changes seen only in function only
{
    cout<<"\nin functions start no1:"<<no1<<" , no2:"<<no2;
    int t=no1;
    no1=no2;
    no2=t;
    cout<<"\nin functions end no1:"<<no1<<" , no2:"<<no2;
}
void swap_by_address(int *no1,int *no2)//pass by address:changes seen at all locations
{
    cout<<"\nin functions start no1:"<<*no1<<" , no2:"<<*no2;
    int t=*no1;
    *no1=*no2;
    *no2=t;
    cout<<"\nin functions end no1:"<<*no1<<" , no2:"<<*no2;
}
void swap_by_reference(int &no1,int &no2)//pass by reference:changes seen at all locations
{
    cout<<"\nin functions start no1:"<<no1<<" , no2:"<<no2;
    int t=no1;
    no1=no2;
    no2=t;
    cout<<"\nin functions end no1:"<<no1<<" , no2:"<<no2;
}

int main()
{
    int no1=10,no2=20;
    cout<<"\nin main start no1:"<<no1<<" , no2:"<<no2;
    //swap_by_value(no1,no2);
    //swap_by_address(&no1,&no2);
    swap_by_reference(no1,no2);
    cout<<"\nin main end no1:"<<no1<<" , no2:"<<no2;
    return 0;
}