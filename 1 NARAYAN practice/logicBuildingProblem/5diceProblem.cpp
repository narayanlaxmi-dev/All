// sume of natural number or n series sum
#include<iostream>
#include<cmath>
using namespace std;
 int diceProblemReverse(int number1){
 	switch(number1){
 		case 1:return 6;
 				break;
 		case 2:  return 5;
 				break;
		case 3: return 4;
 				break;
		case 4: return 3;
 				break;
		case 5: return 2;
 				break;	 
		case 6: return 1;
 				break;		
 		default: cout<<"INVALID INPUT ";
	 }
	 return 0;
 }

int diceProb(int n){
	if(n>=1 && n<=6)
		return 7 -n;
	else 
		return -1 ;
		cout<<"INVALID...";
}

main(){
	
	int number1;
	cout<<"\nEnter numnber to first number :";
	cin>>number1;
	cout<<"\ndice problem :"<<diceProblemReverse(number1);
	cout<<"\ndice problem :"<<diceProb(number1);
}