#include<iostream>
#include<cstdlib>
using namespace std;

#define max 100  // max acc

class Banking {
    private:
        string name, gender;
        int balance, accNumber;
        static int accNumbergenerated;

    public:
        void set_data(string n, string g, int m) {
            name = n;
            gender = g;
            balance = m;
            accNumber = (++accNumbergenerated);
            cout << "Account created successfully! Your Account Number is " << accNumber << endl;
        }

        void deposit(int &balance, int amt) {
            if (amt > 0) {
                balance += amt;
                cout << "\nBalance updated successfully. Current balance: " << balance << endl;
            } else {
                cout << "\nInvalid deposit amount.\n";
            }
        }

        void withdraw(int &balance, int amt) {
            if (amt > balance) {
                cout << "\nInsufficient balance....." << endl;
            } else {
                balance -= amt;
                cout << "\nBalance updated successfully. Current balance: " << balance << endl;
            }
        }

        void checkBalance() {
            cout << "\nCurrent Balance: " << balance << endl;
        }

        float Si(int balance, int y, float r = 3.0) {
            cout << "\nCalculating Simple Interest at rate: " << r << "%";
            return (balance * y * r) / 100;
        }

        int& Balance_access() {
            return balance;
        }

        int getAccountNumber() {
            return accNumber;
        }

        void Display() {
            cout << "\nAccount Holder Name: " << name;
            cout << "\nAccount Number: " << accNumber;
            cout << "\nAccount Balance: " << balance << endl;
        }
};

int Banking::accNumbergenerated = 2050;

int main() {
    Banking account[max];
    int totalacc = 0;
    int ch;

    while (true) {
        cout << "\n--- Banking System Menu ---\n"
             << "1. Create Account \n"
             << "2. Deposit Money  \n"
             << "3. Withdraw Money \n"
             << "4. Check Balance  \n"
             << "5. Calculate Simple Interest\n"
             << "6. Modify Balance \n"
             << "7. Display Account Details \n"
             << "0. Exit \n";
        cout << "Enter your choice: ";
        cin >> ch;

        if (ch == 0) break;

        if (ch == 1) {
            if (totalacc >= max) {
                cout << "Cannot create accounts!\n";
                continue;
            }

            string name, gender;
            int initialBalance;
            cout << "Enter Name: ";
            cin >> name;
            cout << "Enter Gender: ";
            cin >> gender;
            cout << "Enter Initial Balance: ";
            cin >> initialBalance;

            account[totalacc].set_data(name, gender, initialBalance);
            totalacc++;
        } 
        else if (ch >= 2 && ch <= 7) {
            int accNum, amount;
            bool found = false;

            if (totalacc == 0) {
                cout << "\nNo account found Please create an account first." << endl;
                continue;
            }

            cout << "Enter Account Number: ";
            cin >> accNum;

            for (int i = 0; i < totalacc; i++) {
                if (account[i].getAccountNumber() == accNum) {
                    found = true;

                    switch (ch) {
                        case 2:
                            cout << "Enter deposit amount: ";
                            cin >> amount;
                            account[i].deposit(account[i].Balance_access(), amount);
                            break;

                        case 3:
                            cout << "Enter withdrawal amount: ";
                            cin >> amount;
                            account[i].withdraw(account[i].Balance_access(), amount);
                            break;

                        case 4:
                            account[i].checkBalance();
                            break;

                        case 5:
                            cout << "\nSimple Interest for 2 years" << account[i].Si(account[i].Balance_access(), 2) << endl;
                            break;

                        case 6:
                            cout << "Enter new balance: ";
                            cin >> amount;
                            account[i].Balance_access() = amount;
                            cout << "\nBalance modified successfully\n";
                            break;

                        case 7:
                            account[i].Display();
                            break;
                    }
                    break;
                }
            }

            
        } 
    }

    cout << "Thank \n";
    return 0;
}

