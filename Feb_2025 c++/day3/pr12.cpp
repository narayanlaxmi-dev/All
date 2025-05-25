/* write a prog TC time complexicity
*/

#include<iostream>
using namespace std;

int main(){
	int var=1;
	
	while(var <= 50){
		
		if(var <= 7)
			cout<< "\n" << var;// only print 7 but TC is 50 to var inc to 50 so we use break
		else
			break;
			
	var++;
	}
	return 0;
}