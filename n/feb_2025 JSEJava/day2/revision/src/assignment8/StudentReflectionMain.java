package assignment8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentReflectionMain {
	public static void main(String[] args) {
		Class StudentClass1 = Student.class;
		System.out.println(StudentClass1.getClass().getName());
		System.out.println(StudentClass1.getName());
		System.out.println(StudentClass1.getModifiers());
		System.out.println(StudentClass1.getPackageName());

		// fields printing
		System.out.println("Fields: ");
		Field[] fields = StudentClass1.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("Field: " + f.getName());
		}
		
		System.out.println("Methods: ");
		Method[] met = StudentClass1.getDeclaredMethods();
		for (Method m : met) {
			System.out.println("Metohds are :-" + m.getName());
		}
		
		// Constructor printing
		System.out.println("Constructor: ");
		Constructor[] cons = StudentClass1.getDeclaredConstructors();
		for (Constructor c : cons) {
			System.out.println("Field: " + c.getName());
		}
		
//-------------------------------------------------------------------------------------------------		
		try {
			// initial Student constructor Student(String, Integer)
            Constructor cons1 = StudentClass1.getDeclaredConstructor(String.class, int.class);
            Student Student = (Student) cons1.newInstance("Nara", 23);            
//            Student Student2 = (Student) cons1.newInstance();
//            Constructor consdef = StudentClass1.getDeclaredConstructor();
//            Student studentdef = (Student) cons1.newInstance();
            System.out.println("\nCreated Student using constructor: " + Student);
           
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
