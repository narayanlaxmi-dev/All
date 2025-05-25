/* write prog  array scan arr
print max array with index
*/
#include<iostream>
using namespace std;
main()
{
	int arr[5], idx=0, max=0 , i;
	
	for(i=0; i<5; i++)
	{
		cout<<"Enter number for index "<<i<<" =";
		cin>>arr[i];
		
		if(arr[i] > max){
			max = arr[i];
			idx = i;
		}
	}
	cout<<"max value present in array is "<< max <<endl;
	cout<<"index of max value is "<<idx;
	
	
	
	
	
}