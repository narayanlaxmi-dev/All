#include <iostream>
#include <vector>
#include <algorithm>  
using namespace std;

int main() {
    vector<int> fibo={0,1};
    int num;
    cout<<"Enter number:";
    cin>>num;
    //loop n to n-2 push_back v[i]= v[i-1];
    for(int i=2; i<=num-1; i++){
    	    fibo.push_back(fibo[i-1] + fibo[i-2]);
	}
	
	for(int i:fibo){
		cout<<i<<",";
	}
	return 0;	
}