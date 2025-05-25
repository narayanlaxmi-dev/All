// keep add value in vector till -1 
#include<iostream>
#include<vector>
using namespace std;

int main(){
	// create vector dt 
	vector <int> v;
	int n;
	while(1){
		cout<<"Enter number: -1 to stop";
	cin>>n;
	cout<<n;
		if(n ==-1)
			break;
		v.push_back(n);
	}
	v.push_back(12);
	v.push_back(22);
	v.push_back(33);
	v.push_back(43);
	

		
		
	cout<<"Total data on vector"<<v.size();
//	for(int item:v){ // auto iteration
//		cout<<v[item]<<"\n";
//	}
	
	for (int i=0; i<v.size(); i++){	
		cout<<v[i]<<",";
	
	}
	return 0;
}