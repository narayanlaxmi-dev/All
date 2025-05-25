#include<iostream>
#include<map>
#include<set>
// convert given number in word of digits 
// 100 one zero zero
// char ch ='5' ; int num = ch - '0'; convert '5' to 5
using namespace std;

int main(){

	map<int, string> digits ={{0,"zero"},{1,"one"},{2,"two"},{3,"three"},{4,"four"},
							{5,"five"},{6,"six"},{7,"seven"},{8,"eight"},{9,"nine"}} ;

	string word;
	cout<<"Enter number";
	cin>>word;
	for(auto i: word){
		cout<<digits[i-'0']<<" ";
	}
	return 0;
}