/* OOPs Ex 1 Class
by defalut class private do call fun to available
to student detail print higher
(obj return value)

practice
https://www.geeksforgeeks.org/c-classes-and-objects/?ref=lbp

int main()
{
    // Create an object of the Person class
    Person nara;

    // accessing data members
    nara.name = "Alice";
    nara.age = 30;

    // Call the introduce member method
    nara.show();

    return 0;
}
*/
#include<iostream>
#include<cstring>
using namespace std;

class person{
	
	private: // In OOPs private decalre member variable
		int rollno;
		char name[30];
		float percentage;
		
	public:
		void set(){ // to initial value
								
/*	error		name ="narayan"; 
		//	name[0] = 'a'; or  
			strcpy(name, "narayan"); // static name array   */
			cout << "\nEnter Rollno :";
			cin >> rollno;
			cout << "Enter Name :";
			cin >> name;
			cout << "Enter Percentage :";
			cin >> percentage;
			
			
		}
		void show(){ // to print value
			cout<<"\nRollno ="<< rollno <<"\nName ="<< name <<"\nPercentage ="<< percentage << endl;
		}
		
		float compare(){
			return (percentage);
		}
};


main()
{
	person nara, yan;
	
	nara.set();
	yan.set();
	
	if(nara.compare() > yan.compare()){
		cout<<"first statment ";
		nara.show();
	}
	else{
		cout<<"second statment ";
		yan.show();
	}
}