/*
operator overloading:
Create a C++ program that defines a Time class to store hours, minutes, and seconds.
 Overload the + operator using a to add two Time objects. Ensure that the addition correctly handles
  cases where seconds or minutes exceed their limits (i.e., 60 seconds = 1 minute, 60 minutes = 1 hour).
int hours
int minutes
int seconds
void set_time(int h, int m, int s): Sets the time values.
void display(): Displays the time in HH:MM:SS format.
Friend function Time operator+(Time t1, Time t2): Overloads the + operator to add two time objects.
Time t1, t2, t3;
t1.set_time(2, 45, 50);
t2.set_time(1, 20, 30);
t3 = t1 + t2;
t3.display();
o/p
Total Time: 4:06:20 REFER FILE time overload operator 5
*/

#include<iostream>
using namespace std;
class Time
{
    private:
        int hh,mm,ss;
    public:
        void set_details(int hh,int mm, int ss)
        {
            this->hh = hh;
            this->mm = mm;
            this->ss = ss;
        }
       void display_details()
       {
           cout<<"\nafter two time add the answer is: "<<hh<<":"<<mm <<":"<<ss << endl;
       }
       
       friend Time operator+(Time p1,Time p2);
};

Time operator+(Time p1,Time p2)
       {
           Time t;
           t.hh=p1.hh+p2.hh;
           t.mm=p1.mm+p2.mm;
           t.ss=p1.ss+p2.ss;
           return t;//hence return type is Time
       }
int main()
{
 Time p1,p2,p3;
 p1.set_details(2,45,50);
 p2.set_details(1,20,30);
 p3=p1+p2;	
 p3.display_details();			
 return 0;    
}



/*
Time operator-(Time p2)//  p1.operator-(p2) p1 is caller p2 is passed
       {
           Time t;
           t.hh=hh-p2.hh;	
           t.mm=mm-p2.mm;
           t.ss=ss-p2.ss;
		   return t;
       }
*/