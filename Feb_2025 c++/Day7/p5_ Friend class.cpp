/* write a prog create 2 class city1 and city2 
with member name of city and, temperature of city
print the information of city who has higgest temperature
*/

#include<iostream>
using namespace std;

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
			cout<<"\n City name is "<<name<<" name is "<<temperature;
		}
	friend  class city2;
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
		cout<<"\nenter temperature ";
		cin>>temperature;
	}	
	void print(){
		cout<<"\n \n City name is "<<name<<" temperature is "<<temperature;
	}
	
	// compare mem fun parameter is obj
	void compare(city1 obj){ // obj is c1 of city1
		if(temperature > obj.temperature){ // temp is obj og city2 > obj.temp is obj of city1
			cout<<"\nmain City1 ";
			obj.print();
		}
		else
			cout<<"\nfriend City2 ";
			obj.print();
	}
};


main(){
	city1 c1;
	c1.set();
	c1.print();
	
	city2 c2;
	c2.set();
	c2.print();
	cout<<"\n highest city temperature is ";
	c2.compare(c1);
	}
	