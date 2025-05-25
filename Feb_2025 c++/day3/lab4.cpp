/* write prog  generate a randmon number 1 - 10 keep gussing until the correct number use do while
 rand() cstdlib 
 time() ctime
 srand(time(0))
*/

#include<iostream>
#include<cstdlib> // rand() num generate
#include<ctime> // cureent time 
using namespace std;
int main(){
	int no, guess; 
	
	srand(time(0));
	// rand() %10; // goes upto 9
	no = rand() % 10 + 1; // %10 for 1 no %1000 for 3 number eg 1000 limit
		
	do
	{			
		cout<<"\n Enter no";
		cin>>guess;
		
		if(no==guess){
			cout<<"WoW Congrulations!! WINNER .....";
			break;
		}
		else if(no>guess)
			cout<<"guess is to Low";
		else 
			cout<<"guess is to High";
		}	
	
	 while(guess!=no);  // while(1);
	return 0;
}