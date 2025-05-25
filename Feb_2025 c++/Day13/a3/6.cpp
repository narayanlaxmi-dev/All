#include<iostream>
using namespace std;

class Student {
private:
    string name, gender;
    int marks,roll;
    static int rollgenerated;

    // Private calculate percentage
    float percentage() {
        return ((float)marks / 500 * 100);
    }

public:
    // set data for each student
    void set_data(string n, string g, int m) {
        name = n;
        gender = g;
        marks = m;
        roll=(++rollgenerated);  // Static variable increase
        ++rollgenerated;
    }

    // display student 
    void Display() {
        cout << "\n\n--- The Student Record ---";
        cout << "\nThe roll number is : " << roll;
        cout << "\nThe marks are : " << marks;
        cout << "\nThe percentage is: " << percentage() << "%";
    }
};

// Static variable initialization
int Student::rollgenerated = 20050;

int main() {
    // Array of 10 student objects
    Student s[10];
    string n, g;
    int m;

    // Loop to input data for 3 students
    for (int i = 0; i < 3; i++) {
        cout << "\nEnter name of student " << i + 1 << ": ";
        cin >> n;
        cout << "Enter gender of student " << i + 1 << ": ";
        cin >> g;
        cout << "Enter marks of student " << i + 1 << ": ";
        cin >> m;

        s[i].set_data(n, g, m);  // Set data for each student
    }

    // Loop to display data of all students
    for (int i = 0; i < 3; i++) {
        s[i].Display();  // Display details of each s
	}
}