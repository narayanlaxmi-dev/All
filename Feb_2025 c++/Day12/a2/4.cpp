#include<iostream>
using namespace std;
/* code min function whichi will return min of two number
GCD 
*/
int gcdfun(int var1, int var2)//body
{
    if(var1%var2 == 0){
   	cout<<"the number is GCD";
   	return var2;
   }
   else return (var2, var1 %var2);

}

int main()
{   
    int var1, var2;
    cout<<"\n\nEnter two number to check smaller: ";
    cin>>var1>>var2;
    
    if(var1<var2)
    	cout<<gcdfun(var2, var1);
    else
    cout<<"\n N"<<gcdfun(var1, var2);
    return 0;
}