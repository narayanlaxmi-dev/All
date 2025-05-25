package CollectionFramework;

//*************************** list is interface give arraylist linkedlist stack vector ************************
import java.util.ArrayList;

public class ArrayListMain { // duplicate allowrd all collection framework

	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add(1);
		data.add("neyan");
		data.add("LNSHRN");
		data.add(true);

		for (Object obj : data) {
			System.out.println(obj);
		}

	}

}
