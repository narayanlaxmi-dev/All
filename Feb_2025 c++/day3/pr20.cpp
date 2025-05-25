/* write prog  array scan arr
calc sum of array print avg of arr
*/
#include<iostream>
using namespace std;
main()
{
	int arr[5], sum=0, avg=0 , i;
	
	for(i=0; i<=5; i++)
	{
		cout<<"Enter number for index "<<i<<" =";
		cin>>arr[i];
	}
	
	for(i=0; i<=5; i++){
		sum = sum + arr[i];
		cout<<"\nEnter number for index "<<arr[i]<<" =";
	}
	avg=sum/5;
	
	cout<<"Sum of array you enter "<<sum<<endl;
	cout<<"Average of array you enter "<<avg;
	
}