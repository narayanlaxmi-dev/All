/* write prog  array DYNAMIC int array, char arr, float arr
1 for loop for scan otherone for print and 1 other for process
*/
#include<iostream>
using namespace std;
main()
{
	int arr[5] , i;
	char ch[5];
	
	for(i=0; i<=5; i++)
	{
		cout<<"Enter number for index "<<i<<" =";
		cin>>arr[i];
	}
	for(i=0; i<=5; i++)
	{
		cout<<"\n array values are ["<<i<<"]= "<<arr[i];
	}
	
	cout<<"\n";
	for(i=0; i<=5; i++)
	{
		cout<<"Enter Character value you enter "<<i<<" =";
		cin>>ch[i];
	}
	for(i=0; i<=5; i++)
	{
		cout<<"\n array Character values are ["<<i<<"]= "<<ch[i];
	}
}