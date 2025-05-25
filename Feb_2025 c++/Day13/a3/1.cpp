#include<iostream>
using namespace std;
class Human
{
 private:
     string name;
     int age;
     
     int vote()
    {    
       if(age<18)
            return 0;//no
       else
            return 1;//yes
    }
 
     
 public:
      void set_data(string n,int a)
    {
      name=n;
      age=a;
      }

 void result()
    {
        cout<<"hi "<<name<<" at age "<<age;
       // call to private fun vote()
	   if (vote()==1)
            cout<<" you can vote";
        else
            cout<<" you can not vote";
      }
 
};
int main()
{
    //object  <class name> <variable>;
    Human h;
    string n;
    int a;
    cout<<"\nEnter name:";
    cin>>n;
    cout<<"\nEnter age:";
    cin>>a;
    h.set_data(n,a);
    h.result();
    
    return 0;
}