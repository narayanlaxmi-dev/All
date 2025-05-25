/*
friend function:

-not a member but has all right of member.
(can access private member also)

-it is decleared inside defined outside

-friend keyword  used

-always in public
 
-called directly by its name not with class.XXX or object.XXX

-can access private data iff object is passed to it as parameter.

-+ve can be friend of 2 or more:cross class access

*/

#include<iostream>
using namespace std;
class Work;//forward decleration
class Person
{
    private:
        string name,number;
    public:
        void set_details(string name,string number)
        {
            this->name=name;
            this->number=number;
        }
    friend void display_details(Person obj,Work obj2);//decleared that it is friend function
};
class Work
{
    private:
        string position;
        float salary;
    public:
        void set_details(string position,float salary)
        {
            this->position=position;
            this->salary=salary;
        }
    friend void display_details(Person obj,Work obj2);//decleared that it is friend function
};

void display_details(Person obj,Work obj2)
    {
            cout<<"\nFriend accessing\nName:"<<obj.name<<"\tNumber:"<<obj.number;
            cout<<"\nPosition:"<<obj2.position<<"\tSalary:"<<obj2.salary;
    }
int main()
{
    Person obj;
    Work obj2;
    obj.set_details("amar","9821601163");
    obj2.set_details("co-founder",90000);
    //obj.display_details();
    display_details(obj,obj2);
   
}