/*Problem Statement: Shopping List Manager 
(Menu-Driven Program using std::vector in C++)
Objective:
Design a Shopping List Manager in C++ using std::vector, 
which allows users to add, remove, search, display, and clear 
items in the shopping list through a menu-driven program.

Functional Requirements:
The program should support the following features:

Add Item – Allows the user to add an item to the shopping list.
push_back()-if not there already
Remove Item – Allows the user to remove an item from the list if it exists.
erase(on index)
Search Item – Checks if a specific item is in the list.
find()--algorithm
Display List – Shows all items in the shopping list.
interate
Clear List – Removes all items from the shopping list.
clear()
Exit – Terminates the program.
Constraints:
The list should not contain duplicate items.
Items should be stored as strings in a std::vector<string>.
The menu should be looped until the user chooses to exit.

start---list(vector)---do-while(menu)-->input-->switch()--jump,default(error)
*/

#include <iostream>
#include <vector>
#include <algorithm>  // For find()
using namespace std;

int main() {
    vector<string> shoppingList;
    int choice;
    string item;

    while (true) {
        cout << "\n===== Shopping List Menu =====\n";
        cout << "1. Add Item\n";
        cout << "2. Remove Item\n";
        cout << "3. Search Item\n";
        cout << "4. Display List\n";
        cout << "5. Clear List\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        if (choice == 1) {
            // Add Item
            cout << "Enter item name: ";
            cin >> item;  // Single-word input only
			// eg
			// milk egg puram
			// (0,2,"break")-----not found -----3.end()
			// (0,2,"egg")----- found -----1.end()
            if (find(shoppingList.begin(), shoppingList.end(), item) != shoppingList.end()) {
                cout << "Item already in the list!\n";
            } else {
                shoppingList.push_back(item);
                cout << "\"" << item << "\" added to the shopping list.\n";
            }
        }
		 
        else if (choice == 2) 
		{
            // Remove Item
            cout << "Enter item to remove: ";
            cin >> item;

            auto it = find(shoppingList.begin(), shoppingList.end(), item);
           // it is iterate <--- same as index but not index
            if (it != shoppingList.end()) {
                shoppingList.erase(it);
                cout << "\"" << item << "\" removed from the list.\n";
            } else {
                cout << "Item not found in the list.\n";
            }
        } 
        
        else if (choice == 3) {
            // Search Item
            cout << "Enter item to search: ";
            cin >> item;

            if (find(shoppingList.begin(), shoppingList.end(), item) != shoppingList.end()) {
                cout << "\"" << item << "\" is in the shopping list.\n";
            }
			else {
                cout << "Item not found in the list.\n";
            }
        } 
        else if (choice == 4) {
            // Display List
            if (shoppingList.empty()) 
			{
                cout << "Shopping list is empty.\n";
            } 
			else 
			{
                cout << "Shopping List:\n";
                for (int i = 0; i < shoppingList.size(); i++) 
				{
                    cout << i + 1 << ". " << shoppingList[i] << "\n";
                }
            }
        } 
        else if (choice == 5) {
            // Clear List
            shoppingList.clear();
            cout << "Shopping list cleared.\n";
        } 
        else if (choice == 6) {
            // Exit Program
            cout << "Exiting program...\n";
            return 0;
        } 
        else {
            cout << "Invalid choice! Please try again.\n";
        }
    }

    return 0;
}