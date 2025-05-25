#include<iostream>
using namespace std;

class Reservation {
private:
    int trainno = 0, availableseats, book = 0;
    string source, destination;
    
public:
    //  initialize reser 
    Reservation(string source, string destination, int trainno) {
        this->source = source;
        this->destination = destination;
        this->trainno = trainno;  // Correctly assigning trainno
        availableseats = 100;      // Initial seats available
    }

    // Function to book tickets
    int BookTicket(int b) {
        if (availableseats >= b) {  // Check if enough seats are available
            availableseats -= b;  // Decrease  seats
            book += b;            // Increase booked seats
            cout << "Successfully booked " << b << " seats.\n";
        } else {
            cout << "NOT ENOUGH SEATS AVAILABLE.\n";
        }
        return b;
    }

    // Function to display train info
    void display_train_info() {
        cout << "\nSource: " << source;
        cout << "\nDestination: " << destination;
        cout << "\nTrain Number: " << trainno;
        cout << "\nSeats booked: " << book;
        cout << "\nSeats available: " << availableseats;
        cout << "\n";
    }
};

int main() {
    string source, destination;
    int trainno, book;

    // Input details
    cout << "\nEnter source: ";
    cin >> source;
    cout << "Enter destination: ";
    cin >> destination;
    cout << "Enter train number: ";
    cin >> trainno;
    cout << "Enter number of seats you want to book (max 100): ";
    cin >> book;

    // Create reservation object
    Reservation obj(source, destination, trainno);
    
    // Book seats and display train info
    obj.BookTicket(book);
    obj.display_train_info();
    
    // Try booking more seats
    obj.BookTicket(45);
    obj.display_train_info();

    return 0;
}
