package RahulDay1;

public class EmployeeMain {
static {
	System.out.println("EmployeeMain loaded.....");
}
	public static void main(String[] args) {
		System.out.println("main called........");
		Employee e1 = new Employee();
		Employee e2 = new Employee(01, "nara", 5000.2f);
		Employee e3 = new Employee("neyan ", 02, 10000.9f);
		System.out.println("Current  employee count :" + Employee.emp_count);

		System.out.println("Private static Current  employee count :" + e1.getEmpCount1());

		for (int i = 0; i < 5; i++) {
			new Employee();
		}
		System.out.println("Current  employee count :" + Employee.emp_count);
		System.out.println("Private static Current  employee count :" + e1.getEmpCount1());

		System.out.println("static method " + Employee.getEmpCountStat());
	}

}
