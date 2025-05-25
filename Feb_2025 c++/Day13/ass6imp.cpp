/*
student cource management system
add course dynamically allow student add more cours limit 5
remove course provided an option drop course
display total credit show total credit hr for enroll course 
search for course check if std is enroll 

*/

#include<iostream>
using namespace std;

class Course{
	public:
		int course_id , credits;
		string course_name;
		
	public:
		// default constructor
		Course(){
			course_id =0;
			credits=0;
			course_name ="\0";
		}
		// paramaterized constructor
		Course(int course_id, string course_name,int credits){
			this->course_id = course_id;
			this->course_name = course_name;
			this->credits = credits;
		}
		
		// display function
		void display_course(){
			cout<<"the Course ID is:"<<course_id<<endl;
			cout<<"the Course Name  is:"<<course_name<<endl;
			cout<<"the credits id is:"<<credits<<endl;	
		}
};

class Institute{
	public:
		Course courses[10];
		int no_of_courses;
		
	public:
		Institute(){
			no_of_courses = 0;
		}
		
		void add_course(Course c){
			if(no_of_courses < 10){
				courses[no_of_courses] =c;
				no_of_courses++;
			}
			else 
				cout<<"course limit is full"<<endl;
		}
		
		void delete_course(int course_id){
			
			bool found=false;
//			 check number of course
			for(int i=0; i<no_of_courses; i++){
				if(courses[i].course_id == course_id){
					found=true;
//					if id found swap place with previous till n-1
					for(int j=0; j<no_of_courses-1; j++){	// 1 less for empty last poition	
					courses[i] = courses[i+1];
					
					}
					no_of_courses--;
				}
			}
			if(!found)
				cout<<"Given course id not found"<<endl;
		}
		
//		display course present
		void display_course2(){
			for(int i =0; i<no_of_courses; i++){
				courses[i].display_course();
				
			}
		}
		
//		bool course available or not
		bool course_is_available	(int course_ID){
			for(int i=0; i<no_of_courses; i++){
				if(courses[i].course_id = course_ID){
					return true;
				}
				else
					return false;
			}
		}
		
//		Course object get if course return refrence
		Course get_course_id(int course_id){
			for(int i=0; i<no_of_courses; i++){
				if(courses[i].course_id = course_id){
					return courses[i];
				}
			}
			return Course();
		}
};


class Student{
	private:
		int student_id, number_course;
		string name;
		Course enroll_course[5];
	public:
		Student(string name, int student_id){
			this->name = name;
			this->number_course = 0;
			this->student_id = student_id;
			
		}
		
		void enroll_courses(Institute &ins, int course_id ){
			// check enroll course not full
			if(number_course<5){
//				check course is available
				if(ins.course_is_available(course_id))
				{
//					enroll course my courseid
					enroll_course[number_course] = ins.get_course_id( course_id);
					number_course++;
				}
					else
			cout<<"Cannot enrollment"<<endl;
			}
			else{
				cout<<"cant add more than 5 courses\n"<<endl;
			}
		
		}
		
		void remove_courses(int course_id){
			bool f = false;
						
			for(int i=0; i<number_course; i++){
				
				if(enroll_course[i].course_id == course_id){
					f = true;
				cout<<"course is found"<<endl;
					for (int j = i; j < number_course - 1; j++) {
	                    enroll_course[j] = enroll_course[j + 1]; // swap value for enroll course 
	                }
	                number_course--;
	                cout << "Course dropped successfully!" << endl;
	                break;
            
				}
			}if(!f)
				cout<<"Given course id not found"<<endl;
			
		}
		
		void display_student(){
			cout<<"\n Student ID"<<student_id <<"\nname"<<name<<endl;
			for(int i=0; i<number_course; i++){
				enroll_course[i].display_course();
			}
		}
};

int main(){
	Institute inst;
	inst.add_course(Course(101,"C lang", 3));
	inst.add_course(Course(102,".net", 5));
	inst.add_course(Course(103,"spring", 7));
	inst.add_course(Course(104,"c++", 4));
	inst.add_course(Course(105,"C java", 5));
	
	inst.display_course2();
	Student s1( "std1",1);
	
	int courseid;
	cout<<"\n Enter course id";
	cin>>courseid;
	s1.enroll_courses(inst, courseid);
	
	cout<<"\n Enter number to revome course";
	cin>>courseid;
	s1.display_student();
	s1.display_student();
	cout<<"\n enter remove course ";
	cin>>courseid;
	inst.delete_course(courseid);
	
	inst.display_course2();
	
	return 0;
}