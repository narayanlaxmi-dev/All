#include<iostream>
#include<cstring>
using namespace std;

class Person{
	protected: 
		int patient_ID , age;
		string name;
	
	public:
		Person()	{	
		patient_ID = 0;
		age =0;
		}
		
		Person(int patient_ID, int age, string name)	{
			this->age = age;
			this->name = name;
			this->patient_ID = patient_ID;
		}
		
		void display_person(){
			cout<<"\n\tperson id"<<patient_ID<<"\tname"<<name<<"\tage"<<age<<"\n";
		}
		
};

class Patient : public Person{
	private: 
		int contact_no;
		string dises;
	
	public:
		Patient()	{
			contact_no =0; 
		 }
		Patient(int contact_no,  string dises)	{
			this->contact_no = contact_no;
			this->dises = dises;
		}
		
		void display_patient(){
			Person :: display_person();
			cout<<"\n\tcontact_no: "<<contact_no<<"\tdises: "<<dises<<"\n";
		}
};

class Doctor : public Person{
	private: 
		string specialization;
		int  availability;	
	
	public:
		Doctor()	{
		 availability=0;
		 }
		Doctor(int availability, const string specialization)	{
			this->availability = availability;
			this->specialization = specialization;
		}
		
		void display_doctor(){
			Person :: display_person();
			cout<<"\n\tavailability:"<<availability<<"\tspecialization:"<<specialization<<"\n";
		}
};

class Appointment{
	private:
		int appointment_ID, patient_ID, doctor_ID, date, time;
	public:
		Appointment(){
			appointment_ID=0;
			patient_ID=0;
			doctor_ID=0;
			date=0;
			time=0;
		}
		
		Appointment(int appointment_ID,int  patient_ID,int  doctor_ID,int  date,int time){
			this->appointment_ID = appointment_ID;
			this->patient_ID = patient_ID;
			this->doctor_ID = doctor_ID;
			this->date = date;
			this->time = time;
		}
		void display(){
				cout<<"\n\tappointment_ID: "<<appointment_ID<<"\tpatient_ID: "<<patient_ID<<
				"\tdoctor_ID"<<doctor_ID<<"\tdate"<<date<<"\ttime"<<time<<"\n";
		}
};

class Hospital{
	private:
		Patient pat[10];
		Doctor doc[10];
		Appointment app[10];
	public:
		
		void add_patients(int patient_id){
			
//			if(patient_id< pat.patient_ID){
//				for(int i=0; i<9; i++){
//					
//				}
//			}
			
		}
		
		void schedule_appointment(int app_id ){
//			if(app_id< app.appointment_ID){
//				for(int i=0; i<9; i++){
//					
//				}
//			}
		}
		
		void display_allApp(){
//			Appointment :: display_allApp();
		}
};

class Account{
	protected:
		string acc_holder_name ;
		int acc_holder_contactno;
	public:
		Account	(){}
		Account(string acc_holder_name,int acc_holder_contactno ){
			this->acc_holder_contactno = acc_holder_contactno;
			this->acc_holder_name =acc_holder_name;
		}	
		void display(){
			cout<<"\n\taccout hloder name:"<<acc_holder_name<<"\t account holder contact nubmer"<<acc_holder_contactno<<endl;
		}
};

class saving_ : public Account{
	private:
		float saving_acc, balance;
	public:
		void set(float saving_acc, float balance){
			this->balance = balance;
			this->saving_acc = saving_acc;
		}		
		void display(){
			balance += 0.5;
			Account::display();
			cout<<"\n\tsaving account"<<saving_acc<<"\t balance"<<balance<<endl;
		}
};

class current_ : public Account{
	private:
		float current_acc, balance;
	public:
		void set(float current_acc,float balance){
			this->balance = balance;
			this->current_acc = current_acc;
		}
		
		void display_curr(){
			balance += 0.15;
			Account::display();
			cout<<"\n\tcurrent account"<<current_acc<<"\t balance"<<balance<<endl;
		}
};



int main (){
	
	string d, name;
	int ch,c_no=0, person_id=0, age=0;
	do{
		
		cout<<"---- HOSPITAL MANAGEMENT SYSTEM ----\n"
			  "1: create account holders in HMS\n"
			  "2: display details\n"
			  "3: \n"
			  "4: create account balance and display\n"
			  "0: exit()\n"
			  "ENTER CHOISE:";
		cin>>ch;	
		switch(ch){
		case 1:
		{	
				cout<<"Adding data to user";
				
				cout<<"enter Name: ";
				cin>>name;
				getline(cin, name);
				cout<<"enter Person ID: ";
				cin>>person_id;
				cout<<"enter Age: ";
				cin>>age;
				cout<<"enter Disease";
				cin.ignore();
				getline(cin,d);
				cout<<"enter account number";
				cin>>c_no;
				
				Person p(person_id, age, name);
				
				Patient obj(c_no,d);
				obj.display_patient();	
				break;
				}
				
		case 2: {
				cout<<"";
				break;
				}
		case 3: {
				cout<<"Create Account"<<endl;
				Account a(name, person_id);
				saving_ sa;
				sa.set(20.21,40.41);
				break;
			}
		
		case 0: cout<<"exiting... ";
				 exit(0);//break;
		default: cout<<"please enter valid Input";
		}
	}while(1);
	
	return 0;
}