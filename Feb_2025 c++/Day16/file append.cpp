#include <iostream>
#include <fstream>
using namespace std;
int main() {
ofstream outputFile("example.txt", ios::app); // Open the file in append mode
if (outputFile.is_open())
{
	// Append text to the file
	outputFile<<"hello world"<<endl;
	outputFile << "Appended text!" << endl;
outputFile.close();
cout << "Text has been appended to the file." << endl;
} else {
cout << "Unable to open file for appending" << endl;
}
return 0;
}