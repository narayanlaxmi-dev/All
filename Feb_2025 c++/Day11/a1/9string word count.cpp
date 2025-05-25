#include<iostream>
#include<string>
/*
count character freuqncy where charater given by user:
example "this is a sample" char:i print:count:2
*/
using namespace std;
int main()
{
    string line;
    int count=1;
    cout<<"Enter line:";
    getline(cin,line);
    for(int i=0;line[i]!='\0';i++)
        {
            if (line[i]==' ')
             count++;
        }
    cout<<"\nTotal words:"<<count;
    return 0;
}