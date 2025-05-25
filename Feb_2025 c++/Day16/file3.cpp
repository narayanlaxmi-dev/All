//reading created file
#include <iostream>
#include<fstream>
using namespace std;
int main()
{
    string line;
    int lines=0,words=0,characters=0;
//    cout<<"\nEnter name:";
//    cin>>line;
//   	line= "C:/Users/cdac/Documents/Feb_2025/Day16"+line+".txt";
    ifstream myfile("india.txt");

    if(myfile.is_open())//if opened without error
    {
        while(getline(myfile,line))
        {
            cout<<"\nRead Line:"<<line;
            while(getline(myfile,line))
        {
            cout<<"\nRead Line:"<<line;
            for(int i=0;i< line.length();i++)
            {
                cout<<"check in for";
                char c=line[i];
                cout<<"\n--->"<<c;
                if(c=='.')
                    lines++;
                if(c==' ')
                    words++;
               	characters++;
            }
        }
        myfile.close();
        cout<<"\nFile summary";
        cout<<"\nLines:"<<lines;
        cout<<"\nWords:"<<words;
        cout<<"\nCharacters:"<<characters;
    }
}
    return 0;
}
