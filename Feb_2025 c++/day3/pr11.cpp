/* write a prog scan num print sum of digits
enter no 12
v1
sum=3
mod give last digit

reverse number ;- revNum = revNum * 10 + n % 10;
        n = n / 10;
*/

#include<iostream>
using namespace std;

int main(){
	int num, sum = 0, cpy = 0, count= 0, var1 = 0, var2 = 0;
	cout<<"Enter number to sum of that number ";
	cin >> num;
	cpy = num;
	
	while(num>0){
		
		int t = num % 10;
		sum = sum + t; // sum+= num%10; // give last digit
		
		// nothing just for show addition work
		var1 = var2; // give 2 temp var to store previous number
		var2 = sum;
		cout << "\n" << var1 << "+" << t << "=" << sum; 
		
		num = num / 10;
		count++;
	}
	cout<<"\n"<< cpy <<" Sum of number is "<< sum;
	cout<<"\nTotal places = "<<count;
	return 0;
}