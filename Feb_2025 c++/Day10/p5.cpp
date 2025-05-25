/* write prog comblie product and myContact file
ifstream access 2 file 
ofstream acces 1 file that store both file data
 */
#include<iostream>
#include<fstream>
using namespace std;

main(){
	
	// present file in folder
	ifstream read1("myContact.txt");
	ifstream read2("product.txt");
	// new file create 
	ofstream write("concate.txt"); 
	
	if(!read1 && !read2){
		cout<<"\n File not found....";
	}
	else{
			string line1, line2;
			while(!read1.eof() || !read2.eof()) // eof() end of page if curson location is end
			{	
				if(!read1.eof()){
					getline(read1, line1);
					write<<line1<<"\n";
				}
				else if(!read2.eof()){
						getline(read2, line2);
						write<<line2<<"\n";
					}
			}
			read1.close();
			read2.close();
	}
	

	write.close();
	cout<<"\nConcatinated successfully \nfile saved...";
}