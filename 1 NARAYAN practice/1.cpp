#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of students: ";
    cin >> n;

    int marks[n][5]; // 2D array to store marks

    // Input marks
    for (int i = 0; i < n; i++) {
        cout << "Enter 5 marks for student " << i + 1 << ": ";
        for (int j = 0; j < 5; j++) {
            cin >> marks[i][j];
        }
    }

    // Display marks
    cout << "\nMarks entered:\n";
    for (int i = 0; i < n; i++) {
        cout << "Student " << i + 1 << ": ";
        for (int j = 0; j < 5; j++) {
            cout << marks[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
