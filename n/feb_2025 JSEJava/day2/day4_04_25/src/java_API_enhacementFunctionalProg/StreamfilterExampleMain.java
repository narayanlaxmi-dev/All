package java_API_enhacementFunctionalProg;

import java.util.List;
import java.util.function.Predicate;

public class StreamfilterExampleMain {

	public static void main(String[] args) {
		List<Integer> num = List.of(21, 32, 54, 23, 21, 56, 76, 87, 76);
		// functional interface test(T t1) method boolean
//		Predicate<Integer> pr = n -> n % 2 != 0;// odd series
//		num.stream().filter(pr).forEach(n -> System.out.println("odd series :-" + n));
		num.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println("even series :-" + n));
	}

}
