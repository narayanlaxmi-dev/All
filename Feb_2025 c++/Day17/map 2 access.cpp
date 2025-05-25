#include<iostream>
#include<map>
#include<set>

using namespace std;

int main(){
	map<int, string> digits ={{0,"zero"},{1,"one"},{2,"two"},{3,"three"},{4,"four"},
							{5,"five"},{6,"six"},{7,"seven"},{8,"eight"},{9,"nine"}} ;
	
	
	for(const auto &pair:digits){
		cout<<"\n"<<pair.first<<":"<<pair.second;
		}
	
	cout<<"direct acces :-"<<digits[1];
	return 0;
}