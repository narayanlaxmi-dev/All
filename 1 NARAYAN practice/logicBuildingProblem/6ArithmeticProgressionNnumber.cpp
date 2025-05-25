#include <bits/stdc++.h>
using namespace std;

int ArithmeticProgression(int a1, int a2, int n)
{
    int nthTerm = a1;
	int d = a2 - a1;

    for (int i = 1; i < n; i++){
        nthTerm += d;
    }
    return nthTerm;
}
int ap(int a1, int a2, int n){
	  return (a1 + (n - 1) * (a2 - a1)); //10+ ((2-1)* (10-10))    --> 10 +  1*0
}
int main()
{
    int a1, a2 ;
    cout<<"Enter first 1:";
    cin>>a1;
    cout<<"Enter first 2:";
    cin>>a2;
	int n  ;
    cout<<"Enter N term:";
    cin>>n;

    cout << "\n"<<ArithmeticProgression(a1, a2, n);
    cout<<"\nBEST WAY :"<<ap(a1,a2,n);
    return 0;
}
