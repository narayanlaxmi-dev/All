package day5;

public class main_product_bill {

	public static void main(String[] args) {
		BILL b = new BILL(10); // quantity
		b.set(); // call sub class set
		b.show();

		System.out.println("\n\n----- EMPLOYEE MULTILEVEL INHERITANCE ----\n");
		PAYMENT p = new PAYMENT();

		p.set();
		p.display();
		
	}

}
