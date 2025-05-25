	#include<iostream>
	#include<vector>
	#include<map>
	//project level code
	// storing object and access
	using namespace std;
	class Human
	{
	    private:
	        int ACN;
	        string name,gender;
	    public:
	    	Human (){
	    		
			}
	        Human(int ACN,string name,string gender)
	        {
	            this->ACN=ACN;
	            this->name=name;
	            this->gender=gender;
	        }
	        void display_human()
	        {
	            cout<<" answer	: "<<ACN<<","<<name<<","<<gender<<endl;
	        }
	};
	int main()
	{
	    map<int,Human> h_list;
	    Human h(123,"abc","male");
	    h_list[123]=h;// or
	    h_list[001]=Human(001,"narayan","male");
	    h_list[003]=Human(002,"neyan","f");
	    
	    cout<<"\ndata stroed in map\n";
	    h_list[123].display_human(); // or
	   for(auto i: h_list)
	    {
	        cout << "Key: " << i.first << " | Value: ";
	        i.second.display_human();
	    }
	   
	   int key;
	   cout<<"enter ACN";
	   cin>>key;
	   if(h_list.find(key) != h_list.end()) // found
	   		h_list[key].display_human();
	    return 0;
	}