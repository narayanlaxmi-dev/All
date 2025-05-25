package RahulDay1;

public class Employee {
	static {
		System.out.println("Employee class loaded...... at that time static block executed");
	}
	// encapulation =data hiding ->access modifiers used
	private int emp_id; // instance var - copy is created new instance=object
	private String emp_name;
	private float emp_sal;
	static int emp_count; // static var = class var -cpy is created per class
	private static int emp_count1; // Recommended way

	// no argument constructor initilation
	public Employee() {

		emp_count++;
		emp_count1++;
	}

	// right click souce const generatd const fields
	public Employee(int emp_id, String emp_name, float emp_sal) { // sequence change
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
		emp_count++;
		emp_count1++;
	}

	public Employee(String emp_name, int emp_id, float emp_sal) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.emp_sal = emp_sal;
		emp_count++;
		emp_count1++;
	}

	// non static method
	public int getEmpCount1() { // access static and non static var and this
		System.out.println("this access " + this);
		return emp_count1; // calling as obj reference
	}

	// static method
	public static int getEmpCountStat() { // access only static var/ not var or this
		return emp_count1;
	}
}
