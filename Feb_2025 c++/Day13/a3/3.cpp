// method area of rectangle l+w
#include<iostream>
using namespace std;
class Rectangle
{
 private:
 
     float length, width;     

     // dynamic method dont show outside clas
     float calculate(){
     	return length * width;
	 }
	 
 public:
      void set_data(float length,float a)
    {
      this->length = length; // this refer to object member
      width = a;
     
      }

 void Display()
    {
    	cout<<"--- The AREA CAL ---";
        cout<<"\nThe length is : "<< length <<" width: "<< width;
        cout<<"\n AREA is:"<<calculate();
       
 }
};
int main()
{
    //object  <class name> <variable>;
    Rectangle h;

    float length, w;
    cout<<"\nEnter length:";
    cin>>length;
    cout<<"\nEnter breadth:";
    cin>>w;
    
    h.set_data(length, w);
    h.Display();
    
    return 0;
}