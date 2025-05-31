#include <iostream>
using namespace std;

int main() {
    int arr[5] = {1, 2, 3, 4, 5};

    for (int skipIndex = 0; skipIndex < 5; ++skipIndex) {
        int sum = 0;
//        cout << "Skipping index " << skipIndex << ": [ ";
        for (int i = 0; i < 5; ++i) {
            if (i == skipIndex) continue; // skip one element
            sum += arr[i];
            cout << arr[i] << " ";
        }
//        cout << "] => Sum: " << sum << endl;
		cout << sum  << endl;
    }

    return 0;
}
