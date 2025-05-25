/* write a prog create 2 class city1 and city2 
with member name of city and, temperature of city
print the information of city who has higgest temperature
*/

#include<iostream>
using namespace std;

class m_class{
	private:
		char name[20];
		int temperature;
	
	public:
		// set fun 
		void set(){
			cout<<"\nEnter City name ";
			cin>>name;
			cout<<"\nenter tempurature ";
			cin>>temperature;
		}
		// print fun
		void print(){
			cout<<"\n City name is "<<name<<" name is "<<temperature;
		}

 friend  class f_class;
};


class f_class{
	private:
		char name[20];
		int temperature;
	
	public:
	void set(){
		cout<<"\n Enter City name ";
//		cin>>name;
		cin.ignore();
		gets(name);
		cout<<"\nenter temperature ";
		cin>>temperature;
	}	
	void print(){
		cout<<"\n City name is "<<name<<" temperature is "<<temperature;
	}
	
	void compare(m_class obj){
		if(temperature > obj.temperature){ // [Error] 'int m_class::temperature' is private within this context
			cout<<"\nmain City1 ";
			obj.print();
		}
		else
			cout<<"\nfriend City2 ";
			obj.print();
	
	}
};


main(){
	m_class object;
	object.set();
	object.print();
	
	f_class object1;
	object1.set();
	object1.print();
	
	object1.compare(object);
	}