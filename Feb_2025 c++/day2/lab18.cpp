/* write a prog hr  24 format to 12 am /pm format 
*/

#include<iostream>
using namespace std;
int main(){
	int hr,min;
	cout<<"Enter time 24 format ";
		cin>>hr>>min;
		
		if(hr == 0){
			hr = 12;
			cout << hr << ":" << min << " am";
		}
		else if(hr < 12){
			cout << hr << ":"  << min << " am";
		}
		else if(hr == 12){
			cout << hr << ":" << min << " pm";
		}
		else if(hr > 12){
			hr = hr - 12;
			cout << hr << ":" << min << " pm";
		}
		else
		cout<<"NOT VALID SENTENCE";
	
	return 0;
}
	