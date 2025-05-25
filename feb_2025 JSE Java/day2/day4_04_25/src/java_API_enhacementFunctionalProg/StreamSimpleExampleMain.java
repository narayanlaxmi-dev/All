package java_API_enhacementFunctionalProg;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamSimpleExampleMain {

	public static void main(String[] args) {
		List<String> flowers = List.of("rose", "jasmine", "Lotus", "mogra", "parijat");

		Stream<String> streamOfFlower = flowers.stream();
		// consumer is predefine interface only 1 method accept(T t1);
		Consumer<String> flowerconsumer = floweName -> System.out.println(floweName);
		streamOfFlower.forEach(flowerconsumer);

		System.out.println("-------- one line statement (method channing pattern) --------");
		// best method or file to
		flowers.stream().forEach(floweName -> System.out.println(floweName));
	}

}
