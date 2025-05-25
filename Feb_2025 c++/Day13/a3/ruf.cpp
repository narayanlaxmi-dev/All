#include<iostream>
using namespace std;

class Student
{
private:
    string name, gender;
    int marks;     
    static int rollNumber; // Static variable for roll number
    
    // Private method to calculate percentage
    float percentage(){
        return ((float)marks / 500 * 100);  // Cast marks to float and calculate percentage
    }

public:
    // Method to set the student's data
    void set_data(string n, string g, int m)
    {
        name = n;
        gender = g;
        marks = m;
        rollNumber++; // Increment roll number on each call
    }

    // Display method to print student's details
    void Display()
    {
        cout << "--- The Student Record ---";
        cout << "\nThe roll number is: " << rollNumber;
        cout << "\nThe marks are: " << marks;
        cout << "\nPercentage is: " << percentage() << "%\n";
    }
};

// Initialize static variable rollNumber
int Student::rollNumber = 20050;

int main()
{
    Student h;  
    string n, g;
    int m;
    
    cout << "\nEnter name: ";
    cin >> n;
    cout << "\nEnter gender: ";
    cin >> g;
    cout << "\nEnter marks: ";
    cin >> m;
    
  
    h.set_data(n, g, m);
    h.Display();
    
    return 0;
}
