/*
operator overloading:
-operators like +-/ has own use act on some types of data
-if one wants to use operator on custome class then one must overload it
- example  + can add 2 int/floar/double/long double but if we want to add 2 distances in feet and inches then we must over load it
add 2 time in HH:MM:SS then one must overload +

add(t1,t2)------> t3=t1+t2;//easy to understand and use

2 ways to do it
member function		------------------------------------------------
    one is caller other is passed

idetifier starts with "operator<symbol to overload>"(paramenters)

complex operator+(complex o2)
{
//return addition object
}

friend function*		---------------------------------------------
    both are passed(simple and easy)

idetifier starts with "operator<symbol to overload>"(paramenters)

complex operator+(complex o1,complex o2)
{
//return addition object
}
*/

#include<iostream>
using namespace std;
class Complex
{
    private:
        float real,imaginary;
    public:
        void set_details(float real,float imaginary)
        {
            this->real=real;
            this->imaginary=imaginary;
        }
       void display_details()
       {
           cout<<"\n"<<real<<" + "<<imaginary<<" i";
       }
       Complex operator-(Complex p2)//  p1.operator-(p2) p1 is caller p2 is passed
       {
           Complex t;
           t.real=real-p2.real;	// p1 riect pass or access 
           t.imaginary=imaginary-p2.imaginary;
           return t;//hence return type is Comple
       }
       friend Complex operator+(Complex p1,Complex p2);
};

Complex operator+(Complex p1,Complex p2)
       {
           Complex t;
           t.real=p1.real+p2.real;
           t.imaginary=p1.imaginary+p2.imaginary;
           return t;//hence return type is Complex
       }
int main()
{
 Complex p1,p2,p3;
 p1.set_details(5,3);
 p2.set_details(6,2);
 p3=p1+p2;				//operator+(p1,p2)-------->p3 in function var t return
 cout<<"\nadded\n";
 p1.display_details();
 p2.display_details();
 p3=p1+p2;
 p3.display_details();
 p3=p1-p2;				//p1.operator-(p2) //direct  access
 p3.display_details();
 return 0;    
}