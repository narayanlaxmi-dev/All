/*
write a prog create product class
with member var prduct number  pr rate pr quantity
calc amount =rate * quantity
print 2 product info set the  pd rate = 500.75
use default constructor
*/

#include<iostream>
#include<cstring>
using namespace std;

class product{
	private:
		int product_number,  product_quantity;
		float product_rate, amount;
		char name[30];
		
	public: 
	// defalut constructor no need to pass parameter
		product(){					
			product_rate = 500.75; // fix value delcare default		
		}
		
		void set_data(){ // or create sperate member fun for set() or show()
			cout<<"\n\nEnter number :";
			cin>>product_number;	
			cout<<"Enter product quantity :";
			cin>>product_quantity;
			cout<<"Enter NAME :"; //	strcpy(name,"Narayan"); 
//			cin>>name; // or 
			cin.ignore();
			cin.getline(name, 30); // gets(name);
			
			amount = product_rate * product_quantity;
		}
		
		void show_data(){
			cout<<"\n Name "<< name;
			cout<<"\n number "<< product_number;
			cout<<"\n product rate "<< product_rate;
			cout<<"\n product quantity "<< product_quantity;
			cout<<"\n Total amount = "<< amount;
		}
		
};

main(){
	product object1, object2; 
	object1.set_data();
	object1.show_data();
	
	object2.set_data();
	object2.show_data();
}