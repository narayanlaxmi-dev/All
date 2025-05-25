#include<iostream>
using namespace std;
/* code min function whichi will return min of two number
reuse min(no1,no2) to print min of 4 number
*/
int minfun(int var1, int var2)//body
{
    if(var1>var2)
    	return var2;
	
	else if(var1<var2)
		return var1;
		
	else
		return 0;
}
int main()
{   
    int var1, var2, no3,no4;
    cout<<"\n\nEnter two number to check smaller: ";
    cin>>var1>>var2>>no3>>no4;
    int sum = minfun(var1,var2);
    cout<<"\n The minimum value is: "<<sum<<" compare more"<<endl;
    int sum1 = minfun(no3,no4);
    int temp = minfun(sum, sum1);
    cout<< minfun(sum, sum1)<<endl;
    
    
    cout<<"\n Nesting "<<minfun(minfun(sum, sum1), min(no3,no4)); // best nesting in functions IMPORTANT
    return 0;
}