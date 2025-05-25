/* write prog  array scan arr
calc sum even addition and print odd number
*/
#include<iostream>
using namespace std;
main()
{
	int arr[5], idx=0,odd=0 ,sum=0 , i;
	
	for(i=0; i<5; i++)
	{
		cout<<"Enter number for index "<<i<<" =";
		cin>>arr[i];	
	}
	
	for(i=0; i<5; i++)
	{
		if(arr[i] % 2 == 0)
			sum += arr[i];
		else
			odd ++;		
	}
	
	for(i=0; i<5; i++)
	{
		cout<<"\nyou enter array ["<<i<<"]= "<<arr[i];
	}
	cout<<"\nEven number sum are "<<sum;
	cout<<"\nOdd number are "<<odd;

}

	
	
	
	
	
