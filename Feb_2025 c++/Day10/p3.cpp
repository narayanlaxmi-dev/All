/* write prog read file data present or not 
 */
#include<iostream>
#include<fstream>
using namespace std;

main(){
	
//	ifstream rr("a.txt"); //file not found 
	ifstream rr("product.txt");
	
	
	if(!rr){ //if file not found or open
		cout<<"\n file Not Open / not found ....";
		exit(0); // terminate not run hole program
	}
	else{
		string line;
		while(!rr.eof()) // eof mean cursor is last opsition
		{
			getline(rr, line);
			cout<<line<<"\n";
		}
		rr.close();
	}
	cout<<"\n file saved...";
	
}