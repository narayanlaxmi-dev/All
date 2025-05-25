// second largest
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
	// create vector dt 
	vector <int> v = {1,2,3,4,55,66,6,7,8,9};
	sort(v.begin(),v.end());
	cout<<"vector ";
	for(int item:v)
	cout<<"\n "<<item;
	cout<<"\n second largest "<<v[v.size()-2]; // for index located in value we use -1
	cout<<"\n second smallest "<<v[1];
	
	cout<<endl<<"Reverse order "<<endl;
	reverse(v.begin(), v.end());
	for(int j : v)
	cout<<j<<"\n";
	
	cout<<endl<<"find index at 5: "<<endl;
	find(v.begin(), v.end(), 5);
	
	return 0;
}