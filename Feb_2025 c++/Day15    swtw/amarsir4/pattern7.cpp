#include <iostream>
#include<iomanip>
using namespace std;

int main() 
{
cout<<setw(10)<<setfill('X')<<"X";
  for(int i=0;i<10;i++)
 	cout<<endl<<"X"<<setw(9)<<setfill('-')<<"X";
cout<<endl<<setw(10)<<setfill('X')<<"X";
 return 0;
}