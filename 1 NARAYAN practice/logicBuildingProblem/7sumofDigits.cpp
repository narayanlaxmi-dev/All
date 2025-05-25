#include<iostream>
using namespace std;

// Method 1: Iterative approach
int sumOfDigits(int n) {
    int sum = 0;
    while (n != 0) {
        int last = n % 10;
        sum += last;
        n /= 10;
    }
    return sum;
}

// Method 2: Recursive approach
int sum(int n) {
    if (n == 0)
        return 0;
    return (n % 10) + sum(n / 10);  // Recursively sum the digits
}

// Method 3: Using string conversion (treating number as string)
int sumDigits(int n) {
    int sum = 0;
    string num = to_string(n);  // Convert number to string
    for (int i = 0; i < num.length(); i++) {
        int digit = num[i] - '0';  // Convert character to integer
        sum += digit;
    }
    return sum;
}

int main() {
    int number;
    cout << "Enter number to sum: ";
    cin >> number;

    cout << "The sum of given number is (iterative): " << sumOfDigits(number) << endl;
    cout << "The sum of given number is (recursive): " << sum(number) << endl;
    cout << "The sum of given number is (string approach): " << sumDigits(number) << endl;

    return 0;
}
