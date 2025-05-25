/* write prog  coefficient a,b,c 
ax2+bx+c=0 use if else 
discriminate d=b2-4ac is positive print 2 real roots
d=0 single root
d<0 no root
if else if else
*/

#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int a, b, c, r1, r2, d;
	
	cout<<"Enter 3 number ";
	cin>>a>>b>>c;
	
	d = b * b - 4 * a * c;
	
	if(d>0){
		r1 =(-b + sqrt(d)) / (2*a);
		r2 =(-b - sqrt(d)) / (2*a);
		cout<<"Two Real Roots"<<"\n Root 1 ="<<r1 <<"\n Root 2 ="<<r2;
	}
	else if(d==0)
	{
		r1 = -b / (2*a);
		cout<<"\n Only one roots ="<<r1;	
	}
	else 
		cout<<" No Real Roots";	
	return 0;
}