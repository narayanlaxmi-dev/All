#include<iostream>
#include<vector>
#include<set>
using namespace std;

int main(){
	// given v with duplicate extract only unique elements
//	4,1,3,2,6,1,3,4,2,7,1,2,4,3

  vector<int> v= {4,1,3,2,6,1,3,4,2,7,1,2,4,3};
//	vector<int> uniquevectro(v,begin(), v.end());

    set<int> s1; // set is unique and sort value return
//	set<int> uniquevar(v,begin(), v.end());
    for (auto i : v) {
    	s1.insert(i);
        }
    cout <<  "unique element "<<endl;
	
	for (auto i : s1) {
    	cout<<i<<", ";     
		}
	return 0;
}