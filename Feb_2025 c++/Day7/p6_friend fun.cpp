/* write a prog 
*/

#include<iostream>
using namespace std;
// definition remaning class after first class
class city2;


class city1{
	private:
		char name[20];
	protected :
		float temperature;	
	public:
		// set fun 
		void set(){
			cout<<"\nEnter City name ";
			cin.ignore();
			gets(name);
			cout<<"\nenter tempurature ";
			cin>>temperature;
		}
		// print fun
		void print(){
			cout<<"\n City name is "<<name<<"\n temp is "<<temperature;
		}
	friend void compare(city1 obj, city2 myobj); // for function linkup with class
};


class city2{
	private:
		char name[20];
	protected :
		float temperature;
	public:
	void set(){
		cout<<"\n Enter City name ";
		cin.ignore();
		gets(name);
		cout<<"\n Enter temperature ";
		cin>>temperature;
	}	
	void print(){
		cout<<"\n \n City name is "<<name<<"\n temperature is "<<temperature;
	}
	friend void compare(city1 obj, city2 myobj); // for function linkup with class
};


// friend function creation 
void compare(city1 obj, city2 myobj){
	
	if(obj.temperature > myobj.temperature){
		cout<<"\n City1 ";
		obj.print();
	}
	else {
		cout<<"\n City2 ";
		myobj.print();
	}
}

main(){
	city1 c1;
	c1.set();
	c1.print();
	
	city2 c2;
	c2.set();
	c2.print();
	cout<<"\n ------------- Highest temperature -------------";
	compare(c1,c2);
	}
	