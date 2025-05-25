#include<iostream>
using namespace std;

// function created boolean 
bool isEven(int n) { 
  return (n % 2 == 0); 
}

// function created
void rangeEven(int n){
 for (int i = 2; i <= n; i += 2) {  // Start from 2 and increment by 2
        cout << i << " ";  // Print  even 
    }
}
void rangeOdd(int number){
	/*for(int i=1; i<=number; i+=2){
		cout<<i<<" ";
	}*/
	 
	for(int i=0; i<=number; i++){
		if(i % 2 !=0){
			cout<<" "<<i;
		}
	}
}

main(){
	
	int number, even,odd,cou;
	cout<<"even odd series upto n number: ";
	cout<<"enter number : ";
	cin>>number;
	cout<<"\neven number ----\n";
	rangeEven(number);
	cout<<"\nodd nubmer ----\n";
	rangeOdd(number);
	
    if(isEven(number))
         cout << "\nThe number is even : true";
      else 
        cout << "\nhe number is odd : false";


}




