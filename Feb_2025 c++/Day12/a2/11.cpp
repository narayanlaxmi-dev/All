// not sloved
#include<iostream>
// create fun sum of()  return number that once added will give m
// m givem by user
// a[1,2,3,4,5] no=5 1+4 2+3

using namespace std;
void print_array(int x[], int n )
{
    for(int i=0; i<= n  ;i++)
    {
        cout<<"\n "<<i<<" we have "<<x[i];
    }
}

void search_array(int x[],int no, int n )
{	

	for(int i =0; i<n; i++){
		
		for(int j =i+1; j<=n; j++){
			
			if(x[i] + x[j] == no){
				cout<<"("<<x[i]<<","<<x[j]<<")\n";
				
			}
		}
	}
}
int main()
{
    int a[6]={10,20,30,40,5,60}, no;
    cout<<"\n Enter number to search array: ";
    cin>>no;
    
    search_array(a,no,6);
//    print_array(a, 6);
    
    return 0;
   
   
}