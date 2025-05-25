//student class has rollno,name,marks,percentage(auto calculated when marks given)
//read data of 10 students
//print students securing 60%+ only
#include<iostream>
using namespace std;
class Student
{
 private:
     string name;
     int roll,marks;
     float percentage;
     
     
 public:
      void set_data(string n,int r,int m)
    {
      name=n;
      roll=r;
      marks=m;
      percentage=((float)marks/500*100) ;
      }

 void display_data()
    {
        cout<<"\nRoll no:"<<roll;
        cout<<" Name:"<<name;
        cout<<" Marks"<<marks;
        cout<<" Percentage:"<< percentage;
      }
//pivate-public access method:leaky method
   float get_percentage() // pass in main to condition check 
   {
       return percentage;
   }
 
};
int main()
{
    string n;
    int r,m;
 //<data type> id[<size>]
    Student    s[10];//array of object
    for(int i=0;i<3;i++)
    {

        cout<<"\nEnter name:";
        cin>>n;
        cout<<"\nEnter roll number:";
        cin>>r;
        cout<<"\nEnter marks number:";
        cin>>m;
        s[i].set_data(n, r, m);//i=0 s[0] s[1]
        //s[i] is object at ith position   .(membership)    .XXX member of s[i]
    }

    for(int i=0;i<3;i++) //for each student get passing percentage if  >=60 then only print
    //s[i].get_percentage() return percentage value
     if(s[i].get_percentage() > 60)
	 s[i].display_data();
   
    return 0;
}