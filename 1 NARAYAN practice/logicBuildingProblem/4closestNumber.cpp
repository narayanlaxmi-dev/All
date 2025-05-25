// sume of natural number or n series sum
#include<iostream>
#include<cmath>
using namespace std;
 
 int closestDivisible(int n1, int n2){ // suppose 12 5
 	int lwr = (n1 / n2) * n2; // 12/5 ---2 decimal not count in int    2*5 = 10
 	int higher = lwr + n2; // 2 + 5 = 7
 	
	  if (n1 - lwr <= higher - n1) // 12-10 <= 7-12
        return lwr;
    else
        return higher;
 }
 
int closestDivideNum(int n, int m){
	int q = n / m;
    
    // 1st possible closest number
    int n1 = m * q;
    
    // 2nd possible closest number
    int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
    
    // if true, then n1 is the required closest number
    if (abs(n - n1) < abs(n - n2))
        return n1;
    
    // else n2 is the required closest number    
    return n2;    
}
main(){
	
	int number1, number2 ;
	cout<<"\nEnter numnber to first number :";
	cin>>number1;
	cout<<"\nEnter numnber to second number :";
	cin>>number2;
	cout<<" \nBEST closest is : "<<closestDivisible(number1, number2);
	cout<<" \nwith Cmath closest is : "<<closestDivideNum(number1, number2);
}