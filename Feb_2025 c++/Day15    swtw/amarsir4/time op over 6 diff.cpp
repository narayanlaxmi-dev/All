
/*	similar calculate year month days

To code add - that gives difference between 2 times given
Enter first time (hh mm ss): 12 45 30
Enter second time (hh mm ss): 8 20 45
Difference of times: 4:24:45
1.convert both to sec
2.subtract greater from smaller
3.show result in h:m:s(again convert secs to h:m:s)
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
    friend Time operator-(Time t1,Time t2);
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
//Total seconds: 3671
//Converted Time: 1:1:11
Time operator-(Time t1,Time t2)
{
    int t1_total = t1.seconds + t1.minutes*60 + t1.hours*3600;
    int t2_total = t2.seconds + t2.minutes*60 + t2.hours*3600;
    int total_sec;
    if(t1_total>t2_total)
        total_sec=t1_total-t2_total;
    else
        total_sec=t2_total-t1_total;
   
    Time result;
    result.hours =total_sec/3600;
    total_sec=total_sec%3600;//left over mins
    result.minutes = total_sec/60;
    result.seconds = total_sec%60;
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
   
    sum=t1+t2;
    cout << "Difference of times: ";
    sum=t1-t2;
   
    sum.display();
   
    return 0;
}