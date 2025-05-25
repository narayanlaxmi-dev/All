/* all combination four element in givem array whose sum is same as user input
*/
#include<iostream>
using namespace std;

main(){
	int arr[10] = {1,2,3,4,5,6,7,8,9,10}, i=0,j=0,k=0,l=0;
	int user;
	cout<<"\nEnter number to sum combination: ";
	cin>>user;
	
    for( i = 0; i < 9; i++) 
	{  
    	for( j=i+1; j< 9; j++)
		{
			for(k=j+1; j<9; k++)
			{
				for(l=k+1; l<9; l++)
				{
					if(arr[i]+arr[j]+ arr[k]+ arr[l] == user)
					cout<<"The target is: "<<user <<" the array value used "<<arr[i]<<" "<<arr[j]<<" "<<arr[k]<<" "<<arr[l] <<endl ;
				}
			}
		}
	}	
}