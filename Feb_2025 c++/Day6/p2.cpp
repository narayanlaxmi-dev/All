/*

*/

#include<iostream>
using namespace std;

class constructor{
	
	private:
		int var1;
		float var2;
	
	public: // as publice to access constructor 
	
		void show_data(){
			cout<<"\n first = "<<var1<<"\n second = "<<var2;			
		}
		constructor(){
			var1=12;
			var2=12.992;
		}
};

main(){
		
		//	when obj is created const is executed
	constructor obj1, hello; // once create multiple object constructor run all object
	
	obj1.show_data();
	hello.show_data();
}