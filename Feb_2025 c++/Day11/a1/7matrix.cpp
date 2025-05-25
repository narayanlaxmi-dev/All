#include<iostream>
/*
array of size nXm 2d array
transpose matrix
*/
using namespace std;
int main()
{
    int m[10][10],   rows,columns,r,c;
    //  rows columns
   
    cout<<"Enter number of rows and columns:\n";
    cin>>rows>>columns;
    for(r=0;r<rows;r++)
     {
         for(c=0;c<columns;c++)
         {
             cout<<"\nEnter data at ["<<r<<","<<c<<"]-->";
             cin>>m[r][c];
         }
    }
    cout<<"\nEntered elements are\n";
    for(c=0; c<columns; c++) // if i repalace this with inner forloop transpose
     {
        for(r=0; r<rows; r++)
        {
             cout<<m[r][c]<<"\t";
        }
         cout<<"\n";
    }
   cout<<"\nEntered transpose elements are\n";
   	for(r=0; r<rows; r++)  
    {
        for(c=0; c<columns; c++) 
        {
            cout<<m[r][c]<<"\t";
        }
         cout<<"\n";
    }
    return 0;
}