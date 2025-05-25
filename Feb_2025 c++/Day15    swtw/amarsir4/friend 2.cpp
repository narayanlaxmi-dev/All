/*
friend function:
infosis
add feet and inches data together and answer should display only feet or only inches 
used 2 classes feet --stores feet as float (private)
				inch -stores inches as float private
use friend fun add (feet f, inches i); 1feet = 12 inch
2.5 inch ---12 inches 1 foot
feet f/12
inch i*12
*/

#include<iostream>
using namespace std;
class Inches;//forward decleration
class Feet
{
    private:
        float f;
    public:
        void set_details( float f)
        {
            this->f=f;
        }
        
        float calc_feet(){
        	return f*12;
		}
    friend void display_details(Feet obj,Inches obj2);//decleared that it is friend function
};
class Inches
{
    private:
        float i;
        
    public:
        void set_details(float i)
        {
            this->i =i;
        }
        
        float calc_inch(){
        	return i/12;
		}
        
    friend void display_details(Feet obj,Inches obj2);//decleared that it is friend function
};

void display_details(Feet obj,Inches obj2)
    {
            cout<<"\nFriend accessing\n feet:"<<obj.f<<"\ncalc feet t0 inches:"<<obj.calc_feet()<<endl;
            cout<<"\ninches:"<<obj2.i<<"\t calc inches to feet:"<<obj2.calc_inch()<<endl;
    }
int main()
{
    Feet obj;
    Inches obj2;
    obj.set_details(3.5);
    obj2.set_details(10);
    
    //obj.display_details();
    display_details(obj,obj2);
   
}