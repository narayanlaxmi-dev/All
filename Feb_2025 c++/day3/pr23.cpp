/* write prog  array scan arr

*/
#include<iostream>
using namespace std;
main()
{
	int arr[5], count , i;
	
	for(i=0; i<5; i++)
	{
		cout<<"Enter number for index "<<i<<" =";
		cin>>arr[i];
				
		if(arr[i]<0){
			arr[i] = 0;
			count++;
		}			
	}

	for(i=0; i<5; i++)
	{
		cout<<"\nyou enter array ["<<i<<"]= "<< arr[i];
	}
	cout<< "\ntotal Negative places " << count <<endl;

}

	
	
	
	
	
