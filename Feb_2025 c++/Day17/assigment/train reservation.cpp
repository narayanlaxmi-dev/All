#include<iostream>
using namespace std;
class Train{
	protected:
		int train_num, available_seat = 5, bseat;
		string source, destination;			
		Train(){ }
		Train(int train_num, string source, string destination, int bseat){
			this->bseat = bseat;
			this->destination = destination;
			this->source = source;
			this->train_num = train_num;
		}	
	public :
		// Function to display train info
	    void display_train_info() {
	    	cout << "\nTrain Number: " << train_num;
	        cout << "\nFrom: " << source;
	        cout << "\nTo: " << destination;
	        cout << "\nSeats Available: " << available_seat;
	        cout << "\n";
	    }
			
		bool book_seat(int seat){
		if (seat <=available_seat ) {  
            available_seat -= seat;  
            bseat += seat;            
            cout << "Successfully booked " << seat << " seats.\n";
        } else {
            cout << "NOT ENOUGH SEATS AVAILABLE.\n";
        }
        return seat;
		}
		
		int get_train_no(){
			return train_num;
		}	
		int get_availableseat(){
			return available_seat;
		} 	
};

class Local_train : public Train{
	private:
		int no_of_stops;
	public:
		Local_train(){	}
		Local_train(int t, string s, string d,int bseat, int no_of_stops):Train(t,s,d,bseat)
		{
			this->no_of_stops = no_of_stops;
		}		
			void display_train_info() {
	    	Train :: display_train_info(); // calling base class mem fun display
	        cout << "\nnumber of stop taken by local: "<<no_of_stops;
	        cout << "\n";
	    }		
};


class Express_train : public Train{
	private:
		int maxspeed;
	public:
		Express_train(){}
		Express_train(int t, string s, string d,int bseat, int maxspeed):Train(t,s,d,bseat)
		{
		this->maxspeed = maxspeed;
		}	
		void display_train_info() {
			Train :: display_train_info();
	    	cout << "\nnumber of stop taken by Express: "<<maxspeed;
	        cout << "\n";
	    }	
};


// main class to get reservation done 
class Train_reservation_sys {
private:
	Local_train lt[3];
	Express_train et[3];
    int loc_count, exp_count;
    
    
public:
	Train_reservation_sys(){
    	loc_count=0;
    	exp_count=0;
	}
	
    void add_train_local(int no, string src, string des, int bs, int stops){
    	if(loc_count<3)	{
    		lt[loc_count] = Local_train(no, src, des, bs, stops);
			loc_count++;
			cout << "Local Train added successfully!\n";
		}
		else
			cout << "Train is full....\n";
	}
	
	void add_train_express(int no, string src, string des, int bs, int speed){
    	if(exp_count<3)	{
    		et[exp_count] = Express_train(no, src, des, bs, speed);
		exp_count++;
		cout << "Express Train added successfully!\n";
		}
		else
			cout << "Train is full....\n";
	}
	
	void display_all_trains(){
		cout << "\n---- Local Trains ----\n";
        for (int i = 0; i < loc_count; i++) {// local train to book identify
            lt[i].display_train_info();
        }

        cout << "\n---- Express Trains ----\n";
        for (int i = 0; i < exp_count; i++) {// Express train to book identify
            et[i].display_train_info();
        }
	
	}
	
	bool book_ticket(int trainno, int seat){
	for (int i = 0; i < loc_count; i++) {// local train to book identify
            if (lt[i].get_train_no() == trainno) {
                return lt[i].book_seat(seat);
            }
        }

        for (int i = 0; i < exp_count; i++) {// exp train to book identify
            if (et[i].get_train_no() == trainno) {
                return et[i].book_seat(seat);
            }
        }

        cout << "Train not found!\n";
        return false;
    }
	
};


class Person{
	private:
		int age;
		string name; 
	public:
		Person(){}
		Person(int age, string name){
		this->age= age;
		this->name = name;
		}	
		
		void displaydetails(){
			cout<<"\nName"<<name<<"\nage"<<age<<endl;
			
		}
};
class Passenger: public Person{
	private:
		int book_train_no, book_seat;
	public:
		Passenger()	{}
		Passenger(int book_train_no, int book_seat ) {	
		this->book_seat = book_seat;
		this->book_train_no = book_train_no;
		}
		
		void book_ticket(Train_reservation_sys  & sys, int tno, int seats){
			if(sys.book_ticket( tno, seats)){
				book_train_no = tno;
				book_seat = seats;	
			}
			else 
				cout<<"not found"<<endl;
		}
		
		void show_book(){
			if (book_train_no != 0) {
            cout << "\ntrain no: " << book_train_no << "\nseat book: " << book_seat << endl;
        } else 		
            cout << "No booking done!\n";
		}
};
int main() {
    Train_reservation_sys sys;


    sys.add_train_local(101, "nashik", "pune", 5, 3);
    sys.add_train_local(102, "Delhi", "Agra", 5, 4);

   
    sys.add_train_express(201, "Mumbai", "Goa", 5, 150);
    sys.add_train_express(202, "Kolkata", "Chennai", 5, 200);

   
    sys.display_all_trains();
	
  	
    Passenger p1;
    p1.book_ticket(sys, 101, 2);  
    p1.show_book();

    p1.book_ticket(sys, 202, 3);  
    p1.show_book();

   
    sys.display_all_trains();

}
