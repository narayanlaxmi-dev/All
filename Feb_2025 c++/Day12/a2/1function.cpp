#include<iostream>
using namespace std;
/* code min function whichi will return min of two number
reuse min(no1,no2) to print min of 4 number
*/
//global area :anything written in this can be accesseb by anyone in file
void my_function()//body
{
    cout<<"------------------in function start\n";
    cout<<"------------------hi my_function here\n";
    cout<<"------------------in function end\n";
}

void my_function2(string name)//body
{
    cout<<"------------------in function2 start\n";
    cout<<"------------------hi "<<name<<" hope you good\n";
    cout<<"------------------in function2 end\n";
}



float tax(float amount)//body
{
    cout<<"------------------in tax function start\n";
    cout<<"------------------tax is 10% hence "<<amount*0.10;
    return amount*0.10;
}

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
    cout<<"\nin main start\n";
    my_function();//call type 1
    my_function2("Narayan");//call type 2
    float tax_to_pay=tax(100000);//type 3
    cout<<"\nin main tax to pay is:"<<tax_to_pay;
    
    int var1, var2;
    cout<<"\n\nEnter two number to check smaller: ";
    cin>>var1>>var2;
    int sum = minfun(var1,var2);
    cout<<"\n The minimum value is: "<<sum;// or cout<<"\n The minimum value is: "<<minfun(var1,var2);
    cout<<"\nin main end\n";
    return 0;
}