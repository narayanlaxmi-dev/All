package java_API_enhacementFunctionalProg;

public class LambdaExpressionMain {

	public static void main(String[] args) {
		// this anonomous innner class but labda 1 method
		/*
		 * Greeting g1 = new Greeting() {
		 * 
		 * @Override public void doGreet() {
		 * 
		 * } };
		 */

//		 LAMBDA EXPRESSION ALSO said anonomous method
		// ()lambda body -> lambdabody syso()
		Greeting greetlambda = () -> System.out.println("lambda expression !!");

		greetlambda.doGreet();
//		GreetingServices greetservice = (String username) -> System.out.println("hi!!: " + username);

		// variable type inference/ inferred
//		GreetingServices greetservice = (username) -> System.out.println("hi!!: " + username);

		// since themethod accepts only 1 parameter / signature parenthesis() are
		// optional
		GreetingServices greetservice = username -> System.out.println("hi!!: " + username);
		greetservice.sayGreeting("neyan");

		messageService message = (msg, name) -> System.out.println("the msg is " + msg + " for name " + name);
		message.showMessage("morethenanything", "neyan");

		// if lambda consits single statment the return keyword must not be used
		// for multiple used return
		calculator squarecal = n -> n * n;
//		System.out.println(squarecal.calculated(4));
		double haha = squarecal.calculated(4);
		System.out.println(haha);

		calculator squarecal1 = n -> {
			double cube = n * n * n;
			return cube;
		};
		System.out.println("cube: " + squarecal1.calculated(4));
	}

}

@FunctionalInterface
interface calculator {
	double calculated(double num);

}

@FunctionalInterface
interface messageService {
	void showMessage(String msg, String userName);
}

@FunctionalInterface
interface Greeting {
	void doGreet();

}

@FunctionalInterface
interface GreetingServices {
	void sayGreeting(String name);
}