/* multiple inheritance Question
*/
#include<iostream>
using namespace std;

class FY{
	private:
		int eng, math, sci, rollno;	
		char name[30];
	protected:
		int fy_total;	
		
	public:
		void set(){
			cout<<"\n Enter rollno :";
			cin>>rollno;
			cout<<"\n Enter name :";
			cin.ignore();
			gets(name);
			cout<<"\n Enter eng marks :";
			cin>>eng;
			cout<<"\n Enter sci marks :";
			cin>>sci;
			cout<<"\n Enter math marks :";
			cin>>math;
			fy_total = math+sci+eng;
		}
		
		void show(){
			cout<<"\n Enter rollno :"<<rollno;
			cout<<"\n Enter name :"<<name;
			cout<<"\n Enter eng marks :"<<eng;
			cout<<"\n Enter sci marks :"<<sci;
			cout<<"\n Enter math marks :"<<math;
			cout<<"\n Enter 1 Total :"<<fy_total;
		}
};

class SY{ 
	private:
		int c,cpp,java;
	protected:
		int sy_total;
		
	public :
			void set(){
			cout<<"\n Enter C marks :";
			cin>>c;
			cout<<"\n Enter C++ marks :";
			cin>>cpp;
			cout<<"\n Enter Java marks :";
			cin>>java;
			sy_total = c + cpp + java;
			}
					
			void show(){
			cout<<"\n Enter c marks :"<<c;
			cout<<"\n Enter c++ marks :"<<cpp;
			cout<<"\n Enter java marks :"<<java;
			cout<<"\n Enter 2 Total :"<<sy_total;
			}
};

class TY: public FY, public SY{
	private:
		int dbms, msdotnet, adjava, ty_total, final, percentage;
	public :
		void set(){
			FY :: set();
			
			SY :: set();
		
			
			cout<<"\n Enter dbms marks :";
			cin>>dbms;
			cout<<"\n Enter msdotnet marks :";
			cin>>msdotnet;
			cout<<"\n Enter AdJava marks :";
			cin>>adjava;
			
			ty_total = dbms + adjava + msdotnet;
		
			final = ty_total +sy_total +fy_total;
			percentage = final / 12; // total subject
		}
		
		void show(){
			cout<<" \n------------ First Year -------------\n";
			FY :: show();
			cout<<" \n------------ Second Year -------------\n";
			SY :: show();
			cout<<" \n------------ Third Year -------------\n";
			cout<<"\n  dbms marks :"<<dbms;
			cout<<"\n  msdotnet marks :"<<msdotnet;
			cout<<"\n  AdJava marks :"<<adjava;
			cout<<"\n  3 total marks :"<<ty_total;
			cout<<"\n Final total "<<final;
			cout<<"\n percentage "<<percentage;
		}
};


main(){
	TY object;
	object.set();	
	object.show();
}