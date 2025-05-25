#include<iostream>
using namespace std;

class constructor{
	
	private:
		int var;
	
	public: // as publice to access constructor 
	constructor(){
		cout<<"Construction Called";
	}	
};

main(){
	constructor ojb1;

}