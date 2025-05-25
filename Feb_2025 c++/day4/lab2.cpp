/* write menu driven calc add sub mult or divid do while loop
*/

#include<iostream>
using namespace std;
main(){
	int ch, var1, var2, answer, i, count = 0;
	
	
	do{
	cout<<"\nCalculator\n"
		"1 for Addition  :\n"
		"2 for Subtraction  :\n"
		"3 for Multiplicaiton  :\n"
		"4 for divide  :\n"
		"5 for mod  :\n"
		"6 for exit  :\n Enter Choice :";
	cin>>ch;	
		if(ch>=1 && ch<=5){
			cout<<"Enter 2 number";
			cin>>var1>>var2;
		}
		
		switch(ch){
			case 1:
				answer = var1  + var2;
				cout<<"Addition perform "<<var1<<" + "<<var2<<" = "<<answer;
				break;
			case 2: 
				answer = var1  - var2;
				cout<<"Subtraction perform "<<var1<<" - "<<var2<<" = "<<answer;
				break;
			case 3: 
				answer = var1  * var2;
				cout<<"Multiplication perform "<<var1<<" * "<<var2<<" = "<<answer;
				break;
			case 4: 
					if(var2!=0)
					answer = var1  / var2;
				cout<<"Division perform "<<var1<<" / "<<var2<<" = "<<answer;
				break;
			case 5: 
				answer = var1  % var2;
				cout<<"Modulas perform "<<var1<<" % "<<var2<<" = "<<answer;
				break;
			case 6: 
			cout<<"Termination Calculator !!!";
				break;
		default : cout<<"INVALID NUMBER ENTERED....";
			
		}
	}
	while(ch!=6);
	
}