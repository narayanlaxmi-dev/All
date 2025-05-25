/* prog user scan num calc square of number using with return fun
pass square value to cube function
*/

#include<iostream>
using namespace std;

int sq(int x){
	return x*x;
}
int cbe(int y){
	return (y*y*y);
}

int main(){
	int square, answer ;
	cout<<"Enter numbre to find square";
	cin>>square;
	
	answer = sq(square);
	cout<<"The Square is "<<answer;
	
	
	cout<<"Cube of square is "<<cbe(answer);
	return 0;
}