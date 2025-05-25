#include<iostream>
using namespace std;
class Student{
	private:
		int rollnumber,  marks[5], sum;	
		string name;
	public:
		void inputdetails(string n, int r, int m[]) {
        name = n;
        rollnumber = r;
        for (int i = 0; i < 5; i++) {
                marks[i] = m[i]; // copying marks to class variable
            }
			
		}
		
		float calculateavegage(){
			for (int i = 0; i < 5; i++) {
            sum  =sum+ marks[i];
     	   }
       		 return sum / 5;
		}
		void display(){
		
		   cout<<"the rollnumber is: "<<rollnumber<<"\n the name is: " << name<<"\n"<<endl;
		   for (int i = 0; i < 5; i++) {
               cout<< marks[i] ;
            }
            cout<<"\n";
		   cout<<"the average is: "<<calculateavegage();
		}
		
};

main(){
	int r,m[5];
	string n;
	cout<<"\n Enter name: ";
	cin>>n;
	cout<<"Ener Rollnumber: ";
	cin>>r;
	cout<<"Enter marks 5 subject: ";
	for(int i=0; i<sizeof(m)/sizeof(m[0]); i++){
		cin>>m[i];
	}
	
	Student obj;
	obj.inputdetails(n,r,m);
	obj.display();
	
	Student obj1;
	obj1.inputdetails(n,r,m);
	obj1.display();
}