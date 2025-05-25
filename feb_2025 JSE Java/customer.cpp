#include<iostream>
#include<cstring>
using namespace std;
class Account{
	protected:
		string acc_holder_name ;
		int acc_holder_contactno=0;
	public:
		void get(string acc_holder_name,int acc_holder_contactno ){
			this->acc_holder_contactno = acc_holder_contactno;
			this->acc_holder_name = acc_holder_name;
		}		
		void display(){
			cout<<"\n\taccout hloder name:"<<acc_holder_name<<"\t account holder contact nubmer"<<acc_holder_contactno<<endl;
		}
};

class saving_accout : public Account{
	private:
		float saving_acc, balance, total;
	public:
		saving_accout(){
		}
			void set(float saving_acc){
			this->saving_acc = saving_acc;
			
		}
		float add(float balance){
			return balance *= 0.5;
		}	
		void display(){
		
			Account::display();
			cout<<"\n\tsaving account"<<saving_acc<<"\t balance"<<total<<endl;
		}
};

class current_acc : public Account{
	private:
		float current_acc, balance,total;
	public:
		void set(float current_acc){
			this->current_acc = current_acc;		
		}
		float add(float balance){
			return balance = balance + (balance* 0.15);
		}	
		void display_curr(){
			
			Account::display();
			cout<<"\n\tcurrent account"<<current_acc<<"\t balance"<<add(balance)<<endl;
		}
};


main(){
	int n;
	cout<<"How many account add:";
	cin>>n;
	Account a[n];
	saving_accout  s1[n];
	
	for(int i =0; i<n; i++){
		float l , k ;
		a[i].get("narayan",124578);
		cout<<"Enter saving number:"<<endl;
		cin>>l;
		cout<<"Enter salary:"<<endl;
		cin>>k;
		s1[i].set(l);
		
		s1[i].add(k);
	}
	for(int i =0; i<n; i++){
	s1[i].display();
	}
	
}