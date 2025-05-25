/*
implement c++ sopping cart system users add product, calc total and Display cart 
obj classes

*/
#include<iostream>
using namespace std;

class Product {
	private:
	    string name;
	    int product_id,quantity , cart_quantity = 0;
	    float price;
	static int total_items_card; // total items add 
	static 	float total_card_value;// total time * price
	public:
		Product(string name, int product_id, int quantity,int price){
			this->name = name;
			this->product_id = product_id;
			this->quantity = quantity;
			this->price = price;
			cart_quantity = 0;			
		}
		
		void add_item_card(int quantity){
			cart_quantity += quantity;
			++total_items_card;
		}		
		
		void add_card_value(int quantity, float price){
			total_card_value = total_card_value + quantity * price;
		}
		
		void display(){
			cout<<"Name is : "<< name << endl;
			cout<<"Product ID is : "<< product_id << endl;
			cout<<"Product Quantity is : "<< quantity << endl;
			cout<<"Card Quantity is : "<< cart_quantity << endl;
		}
		
		static void displaycardsummary(){
			cout<<" The MODIFY Total items card is : "<< total_items_card << endl;		
			cout<<" The MODIFY Total card value is : "<< total_card_value << endl;
		}
};

int Product :: total_items_card = 0;
float Product :: total_card_value = 0;

int main() {
	string name;
	int product_id,  quantity;
	float price;
	cout<<"\n Enter name: ";
	getline(cin, name);
	cout<<"\n Enter product id: ";
	cin>>	product_id;
	cout<<"\n Enter quantity: ";
	cin>>	quantity;
	cout<<"\n Enter price: ";
	cin>>	price;
	
	Product obj(name,product_id,quantity,price);
	
	obj.add_card_value(quantity, price);
	obj.add_item_card(quantity );
	obj.display();
	obj.displaycardsummary();
	
	Product obj1("hello",02,6,6.5);
	
	obj1.add_card_value(6, 6.5);
	obj1.add_item_card(6 );
	obj1.display();
	obj1.displaycardsummary();
    return 0;
}
