#include<iostream>
/*combine 2 arrays in sorted manner
*/
using namespace std;
void print_array(int a[],int n)
{
	cout<<"\nArray has\n";
	for(int i=0;i<n;i++)
		cout<<a[i]<<",";
}
void sorting(int a[],int size)
{
  int i,j,t;
  for(i=0;i<size-1;i++)	
   {
   	for(j=0;j<size-1;j++)
   	{
   		if(a[j]>a[j+1])
   		{
   			int t=a[j];
   			a[j]=a[j+1];
   			a[j+1]=t;
		   }
	   }
   }
}
void combine(int a[],int a_size,int b[],int b_size,int c[],int c_size)
{
	int c_index=0;
	for(int i=0;i<a_size;i++)
		{
			c[c_index++]=a[i];
		}
	for(int i=0;i<b_size;i++)
		{
			c[c_index++]=b[i];
		}
	cout<<"\nunsorted combined:\n";
	print_array(c,a_size+b_size);
	sorting(c,c_size);
	cout<<"\nsorted combined:\n";
		print_array(c,a_size+b_size);
}
int main()
{
	int a[3]={2,5,1};
	int b[4]={7,6,3,4};
	int c[10];
	print_array(a,3);	
	print_array(b,4);
	combine(a,3,b,4,c,7);
	
	
	return 0;
	
}
