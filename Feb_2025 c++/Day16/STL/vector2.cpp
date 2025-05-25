// keep add value in vector till -1 
#include<iostream>
#include<vector>
using namespace std;

int main(){
	// create vector dt 
	vector <int> v;
	int n=0, sum=0;	
	while(1){
		cout<<"Enter number: -1 to stop";
	cin>>n;
	cout<<n;
		if(n ==-1)
			break;
		v.push_back(n);
		 sum += n;
	}

		// avg calculated 
	  float avg = float(sum) / v.size();
	cout<<"Total data on vector"<<v.size()<<"\t sum"<<sum<<"\t avg"<<avg<<endl;
	for (int i:v){	
		cout<<i<<",";		
	}
	
//	find sum avg in all element on vector print element avg only	
	for (auto i:v){	
//		cout<<i<<",";		
			if(i<avg)
		cout<<endl<<i;
	}

	return 0;
}