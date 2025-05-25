// write a prog//pattern printing 3
#include<iostream>
using namespace std;
main(){
	int i, j, k, num;
	cout<<"Enter number";
	cin>>num;
	for(i=1; i <= num; i++){
		
		for(j=1; j <= 2*(num-i)-1; j++){
			printf(" ");
		}
			for(k=1; k<=i; k++){
				printf("* ");
			}
		cout<<"\n";
	}
		
}
		

