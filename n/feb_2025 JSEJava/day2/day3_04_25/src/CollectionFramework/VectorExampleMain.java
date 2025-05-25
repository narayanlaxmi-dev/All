package CollectionFramework;

import java.util.Vector;

public class VectorExampleMain {

	public static void main(String[] args) {
		Vector data = new Vector();
		System.out.println("Initial size  is :" + data.size());
		System.out.println("Initial Capacity is : " + data.capacity());
		for (int i = 1; i <= 11; i++) {
			data.add(i);
		}
		System.out.println("value added using forloop add() : " + data);
		System.out.println(" Size  is :" + data.size());
		System.out.println(" Capacity is : " + data.capacity()); // dynamically increased
		for (int i = 1; i <= 11; i++) {
			data.removeAllElements();
		}
		System.out.println("remove all element " +
 data);
		System.out.println(" final Capacity is : " + data.capacity()); // dynamically increased
	}

}
