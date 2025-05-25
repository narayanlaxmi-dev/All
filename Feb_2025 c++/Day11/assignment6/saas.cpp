#include<iostream>
using namespace std;

void Display(string s, int bal) {
    cout << "\nAccount Holder Name: " << s;
    cout << "\nAccount Balance: " << bal;
}

void deposit(int &balance, int amt) {
    balance += amt;
    cout << "\nBalance updated successfully. Current balance: " << balance;
}

void withdraw(int &balance, int amt) {
    if (amt > balance) {
        cout << "\nInsufficient balance!";
    } else {
        balance -= amt;
        cout << "\nBalance updated successfully. Current balance: " << balance;
    }
}

float Si(int balance, int y, float r = 3) {
    cout << "\nCalculating Simple Interest at rate: " << r << "%";
    return (balance * y * r) / 100;
}

int& Balance_access(int &ba) {
    return ba;
}

int main() {
    int balance, amt, wdarw, value;
    cout << "--- WELCOME TO BANK SYSTEM ---" << endl;
    
    string name;
    cout << "Enter name: ";
    cin >> name;
    
    cout << "Enter initial balance: ";
    cin >> balance;
    
    int ch;
    
    // Main menu loop
    while (true) {        
        cout << "\nEnter 1 to WITHDRAW\n"
             << "Enter 2 to DEPOSIT\n"
             << "Enter 3 to CHECK BALANCE\n"
             << "Enter 4 to CALCULATE SIMPLE INTEREST\n"
             << "Enter 5 to MODIFY BALANCE\n"
             << "Enter 6 to DISPLAY NAME AND BALANCE\n"
             << "Enter 0 to EXIT\n";
        
        cin >> ch;
        
        switch (ch) {
            case 1: 
                cout << "Enter amount to withdraw: ";
                cin >> amt;
                withdraw(balance, amt);
                break;
            case 2: 
                cout << "Enter amount to deposit: ";
                cin >> amt;
                deposit(balance, amt);
                break;
            case 3: 
                cout << "The current balance is: " << balance << endl;
                break;
            case 4: 
                cout << "The Simple Interest for 2 years is: " << Si(balance, 2) << endl;
                break;
            case 5: 
                cout << "\nEnter new balance: ";
                cin >> value;
                Balance_access(balance) = value;
                cout << "After modification, the balance is: " << balance << endl;
                break;
            case 6: 
                Display(name, balance);
                break;
            case 0: 
                cout << "Exiting the system..." << endl;
                exit(0);  // Proper exit
            default: 
                cout << "INVALID ENTRY..." << endl;
        }
    }

    return 0;
}
