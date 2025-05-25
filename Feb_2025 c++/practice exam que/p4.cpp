#include<iostream>
using namespace std;

class Rectangle;  

class Square {
    private:
        float a;  
    protected:
        float areasq;  
    public:
        
        void set_data() {
            cout << "\nEnter side of the square: ";
            cin >> a;
            areasq = a * a;  
        }
        
        void get_data() {
            cout << "Area of Square is: " << areasq << endl;
        }

        friend void compare(Square, Rectangle);
};

class Rectangle {
    private:
        float l, b;  
    protected:
        float areare;  // Area of the rectangle
    public:
       
        void set_data() {
            cout << "\nEnter length of the rectangle: ";
            cin >> l;
            cout << "Enter breadth of the rectangle: ";
            cin >> b;
            areare = l * b;  
        }

        
        void get_data() {
            cout << "Area of Rectangle is: " << areare << endl;
        }

  
        friend void compare(Square, Rectangle);
};


void compare(Square s, Rectangle r) {
    if (r.areare > s.areasq) 
        cout << "The area of Rectangle is greater." << endl;
     else if (r.areare < s.areasq) 
        cout << "The area of Square is greater." << endl;
     else 
        cout << "Both areas are equal." << endl;
    
}

int main() {
    Square s1; 
    Rectangle r1;  

    
    s1.set_data();
    s1.get_data();
  // Get and display the data for Rectangle
    r1.set_data();
    r1.get_data();

    // Compare the areas of Square and Rectangle
    compare(s1, r1);

    return 0;
}
