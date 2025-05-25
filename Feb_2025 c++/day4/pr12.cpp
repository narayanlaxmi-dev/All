/* prog to print matrix
*/
#include<iostream>
using namespace std;
int main(){
	int arr[2][3], i=0,j;
	cout<<"Enter Matrix value 2 D array :";
	for(i; i<2; i++)
	{
		for (j=0; j<3; j++ )
		{
			cout<<"Enter value row="<<i<<" column="<<j;
			cin>>arr[i][j];
		}
	}
	cout<<"\nMatrix Displayed\n";
	for(i=0; i<2; i++){
		for(j=0; j<3; j++){
			cout<<"\t"<<arr[i][j];
		}
		cout<<"\n";
	}
	return 0;
}