#include<iostream>
#include<cstdlib>
using namespace std;

class Banking{
	private:
			string name, gender;
	    	int marks,roll;
	    	static int rollgenerated;
	public:
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
			        cout << "\nInsufficient balance.....";
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


			// set data for each student
			    void set_data(string n, string g, int m) {
			        name = n;
			        gender = g;
			        marks = m;
			        roll=(++rollgenerated);  // Static variable increase
			        
			    }
};

int Banking :: rollgenerated = 20050;


int main() {
    int balance, amt, wdarw, value;
    string name;
    cout << "==== Banking System Menu ====" << endl;
    
    Banking account; //object
    
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
        	case 1 : 	
				    cout << "Enter name: ";
				    cin >> name;
    				cout << "Enter initial balance: ";
    				cin >> balance;
        			break;
            case 2 : 
	                cout << "Enter amount to withdraw: ";
	                cin >> amt;
	                account.withdraw(balance, amt);
	                break;
            case 3: 
	                cout << "Enter amount to deposit: ";
	                cin >> amt;
	                account.deposit(balance, amt);
	                break;
            case 4: 
	                cout << "The current balance is: " << balance << endl;
	                break;
            case 5: 
	                cout << "The Simple Interest for 2 years is: " << account.Si(balance, 2) << endl;
	                break;
            case 6: 
	                cout << "\nEnter new balance: ";
	                cin >> value;
	                account.Balance_access(balance) = value;
	                cout << "After modification, the balance is: " << balance << endl;
	                break;
            case 7: 
	                account.Display(name, balance);
	                break;
            case 0: 
	                cout << "Exiting the system..." << endl;
	                exit(0);  // terminate compiler
            default: 
                	cout << "INVALID ENTRY..." << endl;
        }
    }

    return 0;
}
