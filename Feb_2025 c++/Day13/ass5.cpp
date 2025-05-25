#include<iostream>
using namespace std;

class Book{
	public:
		int book_id;
		string name, auther;
		bool is_available;
	public:
		Book(){
			book_id = 0;
	}
		Book(int Book_id, string name ,string auther ){
		this->auther  = auther;
		this->book_id = Book_id;
		this->name 	  = name;	
		is_available  = true;
		}
		
		int get_book_id() {
        return book_id;
    	}
		void dispaly_data(){
			cout<<"\nbook id is : "<< book_id << endl;
			cout<<"Name is : "<< name << endl;
			cout<<"Auther ID is : "<< auther << endl;
			cout<<"is available is : "<< is_available ? "\n available": "\n not available";
		}
};

class Library{
	public:
		Book books[5];
		int no_book;
	public:
		Library(){
		no_book=0;
		}
		
//		book add data
		void add_book(Book &b){
			if(no_book<5)
			{
				books[no_book]=b;
				no_book++;
			}else {
            cout << "\nLibrary is full. Cannot add more books." << endl;
        	}
		}
		void display(){
			for(int i = 0; i<no_book; i++){
				books[i].dispaly_data();
			}
		}
		int find_book_index(int id){
			for(int i=0; i<no_book; i++){
				if(id == books[i].book_id ){
					return i;
				}
				else
				return -1;
			}
		}
};


class Customer {
private:
    string name;
    int borrow_book_index;
public:
    // Constructor Customer
    Customer(string n) {
        name = n;
        borrow_book_index = -1;
    }

    // Borrow a book  library
    void borrowbook(Library &lib, int Bookid) {
        int index = lib.find_book_index(Bookid);
        if (index != -1) {
            if (lib.books[index].is_available) {
                borrow_book_index = index;
                lib.books[index].is_available = false;
                cout << "You have borrowed " << lib.books[index].name << endl;
            } else if (!lib.books[index].is_available) {
                cout << "The book is not available "<< endl;
            } else {
                cout << "You have  borrowed a book."<<endl;
            }
        } else {
            cout << "\nBook not in the library." << endl;
        }
    }
    
    
    void returnbook(Library & lib){
    	lib.books[borrow_book_index].is_available = 1;
    	borrow_book_index =false;
	}
	
	
};
main (){
	
    Book b1(1, "book1", "c++");
    Book b2(2, "book2", ".net");
    
    
    Library lib;
    lib.add_book(b1);
    lib.add_book(b2);
    
    lib.display();

   
    Customer c("customer");
    c.borrowbook(lib, 1);  
    c.returnbook(lib);
    
    lib.display();
    
}