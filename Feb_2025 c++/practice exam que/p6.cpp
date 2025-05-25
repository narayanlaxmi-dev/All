 /* Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' and address as "not available".
 It has two functions with the same name 'setInfo'. First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint - Use array of objects.
*/

#include<iostream>
using namespace std;
class Student{
	private:
		int  age ;
		string name,address;
	public:
		Student(){
			 name = "unknown";
			 age = '0';
			 address = "not available";
		}	
		void set_info(string name ,int age){
			this->age = age;
			this->name = name;
		}		
		void set_info(string name  , string address, int age){
			this->age = age;
			this->name = name;
			this->address = address;
		}		
		void display_std(){
			cout<<"Name is: "<< name << endl;
			cout<<"age is: "<< age << endl;
			cout<<"address is: "<< address << endl;
		}
};

main(){
	Student s1[10];
	int n, i, age;
	string name;
	cout << "Enter Number of Employees - "<<endl;
  	cin >> n;
  
  	cout<<"Enter students record"<<endl;
	for(i=0; i<n; i++){
		cout<<"\nEnter name data ["<<i<<"]  :";
		cin>>name;
		cout<<"\n age :";
		cin>>age;
		s1[i].set_info(name,age); // set info for data
	}
	cout<<"Display information ......"<< endl;
	for(i=0; i<n; i++){
		s1[i].display_std();
	}
}