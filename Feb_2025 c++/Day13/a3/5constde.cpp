/*
Constructor:
-a function have same name of class itself and no return not even void
-method called on its own when object is created.
-use: initialize data(default/user given value),make copy of object
types of constructors:
    1.default
    2.parameterized
    3.copy constructor
    when we have more than 1 constructor it is constructor overloading
    overloading done for better useabilitiy or options.
destructor:        
    -a function have same name of class itself and no return not even void
    - starts with '~'
    -called on its own when object is to be removed from system as not in use
     
*/
#include<iostream>
using namespace std;
class Human
{
 private:
     string name;
     int age;
         
 public:
     //having more than 1 constructor is called constructor/function overload
     Human()
     {
         cout<<"\nfrom default constructor:default values given";
         name="un-named";
         age=0;
     }
     
     Human(string name,int age)
     {
         cout<<"\nfrom parameterized constructor:set to values given";
         this->name=name;
         this->age=age;
     }
   
   
    Human(Human &x)
     {
         cout<<"\nfrom copy constructor:set to values given";
         this->name=x.name;
         this->age=x.age;
    }
      void set_data(string n,int a)
    {
      name=n;
      age=a;
      }

 void intro()
    {
        cout<<"\n hi "<<name<<" and i am "<<age<<" old.";
      }
    ~Human()
    {
        cout<<"\nR.I.P "<<name;
    }
 
};
int main()
{
   
    Human h("shati man",60);
    h.intro();
    Human h2("superman",36);
    h2.intro();
    Human h3(h2);
    h3.intro();
    /*
    string n;
    int a;
    cout<<"\nEnter name:";
    cin>>n;
    cout<<"\nEnter age:";
    cin>>a;
    h.set_data(n,a);*/
   
    return 0;
}