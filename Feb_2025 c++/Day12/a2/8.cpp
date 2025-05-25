#include<iostream>
using namespace std;
/* code min function whichi will return min of two number
write add func which read 2 number give total
cunction woldnot return aslo would not print answer 
aswer is printed in main
*/

void add(int no1,int no2, int &sum) // take refrence in sum and print
{
   sum=no1+no2;
}

int main()
{
    int no1, no2;
    cout<<"\n\nEnter two number add: ";
    cin>>no1>>no2;
    int sum=0;
	add(no1,no2,sum);
    cout<<"\n addition is "<<sum;
    return 0;
}