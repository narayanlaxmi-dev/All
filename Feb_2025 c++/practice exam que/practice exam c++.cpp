C++ Programming

1.
 Write a c++ program to find volume of cylinder, cone and sphere. (Use function overloading)
 Cylinder = πr2h pi= 3.14* r*r*h;
 Cone = πr2h/3   pi=3.14*r*r*h/3;
 Sphere = 4/3πr3 4.0/3 *pi=3.14*r*r*r;

2. Write a c++ program to accpet worker information Worker_Name, No_Of_Hours_Worked, Pay_Rate and Salary.
Write necessary functions to calculate and display the salary of Worker. (Use Default values for Pay_Rate)

3. Write a c++ program to create a 
base class Employee(Emp-Code, Name, Salary).
 Derive two classes as 
Fulltime (daily_wages, number_of_days) and 
Parttime (number_of_working_hours, hourly_wages).
Write a menu driven program to perform following funcitons:
    1. Accept the details of 'n' employees and calculate the salary.
    2. Display the details of 'n' employees.
    3. Display the details of employee having maximum salary for both types of employees.
    
4. Create a C++ base class Shape. 
Derive three different classes
 Circle, Sphere and Cylinder from shape class. 
Write a C++ program to calculate area of Circle, Sphere and Cylinder. 
5.
Write a C++ program to create two Classes Square and Rectangle. 
Compare area of both the shapes using friend function. 
Accept appropriate data members for both the classes.

6. Write a C++ Program to accept 'n' numbers from user. 
store all Even and Odd Number in File "Even.txt" and "Odd.Txt".

7. Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' and address as "not available".
 It has two functions with the same name 'setInfo'. First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint - Use array of objects.
8.
Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I love programming languages" 
should be printed. If some String is passed to it, then in place of "programming languages" 
the name of that String variable should be printed.
For example, while creating the object if we pass "cpp", then 
"I love cpp" should be printed.
After compile Delete all objects.

9. Write a C++ program to create a class Date which contains three 
data members as dd, mm, yyyy. 
Create and initialize the object by using parameterized constructor and 
display date in dd-mon-yyyy format. (Input: 19-12-2014 Output: 19-Dec-2014) 
Perform validation for month

10.Write a C++ program to create a class Item with data members Item_Code, 
Item_Name, Item_Price. Write member functions to accept and display 
Item information also display number of objects created for a class.
 (Use Static data member and Static member function)

11.Write a C++ program to create a class Employee which
  contains data members as Emp_Id, Emp_Name, Basic_Salary, HRA, DA, 
Gross_Salary.
  Write member functions to accept Employee information. Calculate and display
  Gross salary of an employee. 
(DA=12% of Basic salary and HRA = 30% of Basic salary)
 

12.
Write a C++ program to create a class Book which contains data members as 
B_Id, B_Name, B_Author, B_Publication. 
Write member functions to accept and display Book information also display 
Count of books. (Use Static data member to maintain Count of books) 
13. Create a class Point that has x & y as integer data members. 
Write a C++ program to perform following functions: void setpoint(int, int) 
To set the specified values of x and y in object. void showpoint() 
To display contents of point object. point addpoint(point) 
To add the corresponding values of x, and y in point argument to current point 
object return point.
14. Create a base class Account (Acc_Holder_Name, Acc_Holder_Contact_No). 
Derive a two classes as Saving_Account(S_Acc_No., Balance) and 
Current_Account( C_Acc_No., Balance) from Account. 
Write a C++ menu driven program to perform following functions : 
Accept the details for n account holders.
 Display the details of n account holders by adding interest 
amount where interest rate for Saving account is 5% of balance and 
interest rate for Current account is 1.5% of balance

15.Write C++ program to Create two classes Array1 and Array2 which contains 
data members as Integer array of a specified size. 
Write necessary member functions to accept and display array elements 
of both the classes. Find and display smallest number from both the array.
 (Use Friend function)

16. Create a Base class Train containing protected data members as 
Train_no, Train_Name. Derive a class Route (Route_id, Source, Destination) 
from Train class. Also derive a class Reservation
(Number_Of_Seats, Train_Class, Fare, Travel_Date) from Route. 
Write a C++ program to perform following necessary functions : 
Enter details of n reservations Display details of all reservations Display 
reservation details of a specified Train class.

17.Create two base classes Learning_Info( Roll_No, Stud_Name, Class, Percentage) 
and Earning_Info(No_of_hours_worked, Charges_per_hour). 
Derive a class Earn_Learn_info from above two classes. 
Write necessary member functions to accept and display Student information. 
Calculate total money earned by the student. (Use constructor in derived class)

18.Define a class Product that contains data member as 
Prod_no, Prod_Name, Prod_Price. 
Derive a class Discount(discount_in_Percentage) from class Product.
 A Customer buys ‘n’ products. Accept quantity for each product , 
calculate Total Discount and accordingly generate Bill. 
Display the bill using appropriate Manipulators.

19.Create a base class Conversion. Derive three different classes 
Weight (Gram, Kilogram), Volume(Milliliter, Liter), 
Currency(Rupees, Paise) from Conversion class. 
Write a C++ program to perform read, convert and display operations.
 (Use Pure virtual function)

20. 
Write a program create employee class with members variable
emp_id
Emp_name
Salary
scan the 6 month attendence(use Array)
calculate the total attendence
if total attendence days >=150 the update salary by 1000
other wise update by 500
21. Write the definition for a class called point that has x & y as integer 
data members. Overload the assignment operator (=) to copy one object to another. 
(Use Default and parameterized constructor to initialize the appropriate objects) 
Write a C++ program to illustrate the use of above class.