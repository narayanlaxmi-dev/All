/* write prog scan 5 prod info sotre inside file
 product no, name and rate
 */
#include<iostream>
#include<fstream>
using namespace std;

main(){
	
	// create file 
	ofstream ot;
	ot.open("product.txt");
	
	int pno, i=0;
	float rate;
	cout<<"\n Enter 5 product information";
	
	// scan data or input in file 
	for(i=0; i<5; i++){
		cout<<"Enter product number and rate";
		cin>>pno>>rate;
		ot<<"\nProduct number "<<pno<< endl<<"Product rate   " <<rate<<endl;
	}
	ot.close();
	
	ifstream in;
	in.open("product.txt");
	
	for(i=0; i<5; i++){
		cout<<"\n Product number "<<pno;
		in>>pno;
		cout<<"\n Product rate   "<<rate;
		in>>rate;
	}
	
	
	
}