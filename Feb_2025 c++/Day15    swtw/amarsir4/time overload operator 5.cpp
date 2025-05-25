/*
Time t1, t2, t3;
t1.set_time(2, 45, 50);
t2.set_time(1, 20, 30);
t3 = t1 + t2;
t3.display();
o/p
Total Time: 4:06:20
*/
#include <iostream>
using namespace std;

class Time {
private:
    int hours, minutes, seconds;
public:
    void setTime(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }
    void display(){
        cout <<endl<< hours << ":" << minutes << ":" << seconds << endl;
    }
    friend Time operator+(Time t1,Time t2);
};

Time operator+(Time t1,Time t2) {
    Time result;
    result.seconds = t1.seconds + t2.seconds;
    result.minutes = t1.minutes + t2.minutes + (result.seconds / 60);
    result.hours = t1.hours + t2.hours + (result.minutes / 60);
    result.seconds %= 60;
    result.minutes %= 60;
    return result;
}

int main() {
    Time t1, t2, sum;
    int h, m, s;
   
    cout << "Enter first time (hh mm ss): ";
    cin >> h >> m >> s;
    t1.setTime(h, m, s);
   
    cout << "Enter second time (hh mm ss): ";
    cin >> h >> m >> s;
    t2.setTime(h, m, s);
   
    sum=t1+t2;
   
    cout << "Sum of times: ";
    sum.display();
   
    return 0;
}