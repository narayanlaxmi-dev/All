// method percentage that return percetage / 500 total not seen from outside but display \
// print display rollno marks perentage
#include<iostream>
using namespace std;
class Student
{
 private:
     string name;
     int rollNumber, marks;     

     
     float percentage(){
     	// dynamic casting (float)marks   DYNAMIC CASTING
     	return ((float)marks / 500 *100);
	 }
	 
 public:
      void set_data(string n,int a, int m)
    {
      name=n;
      rollNumber=a;
      marks=m;
      }

 void Display()
    {
    	cout<<"--- The Student Record ---";
        cout<<"\nThe rollNumber is : "<< rollNumber <<"hi "<< name  <<"\nThe marks is : "<< marks;
        cout<<"\n percentage is:"<<percentage();
       
 }
};
int main()
{
    //object  <class name> <variable>;
    Student h;
    string n;
    int a, m;
    cout<<"\nEnter name:";
    cin>>n;
    cout<<"\nEnter rollno:";
    cin>>a;
    cout<<"\nEnter marks:";
    cin>>m;
    h.set_data(n, a, m);
    h.Display();
    
    return 0;
}