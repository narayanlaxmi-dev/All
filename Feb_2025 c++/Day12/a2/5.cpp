#include<iostream>
using namespace std;
/* code min function whichi will return min of two number
x^n power find out
*/
float power(float no, int n)
{
    if(n == 0)
     return 1;
    else
    return no * power(no,n-1);

}

int main()
{   
    int no;
	float pow;
    cout<<"\n\nEnter two number power x ^ n: ";
    cin>>no>>pow;
    cout << power(pow, no);
 
    return 0;
}