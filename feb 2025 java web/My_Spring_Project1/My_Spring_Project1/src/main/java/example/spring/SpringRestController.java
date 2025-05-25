package example.spring;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

	@GetMapping("/doGreet")
	public String getGreetingData() {
		return "<H1 style='color:white; background:linear-gradient(120deg,red,black)'>Hi all Welcome to Spring REST<h1/>";
	}

	@GetMapping("/showGreeting")
    public Greeting getOneGreeting() {
    	Greeting greetingObject=new Greeting("<h1 style='background-color:violet; color:white;'>Happy New Year<h1>/",LocalDate.of(2025, 1, 1));
    	return greetingObject;
    }
	
	@GetMapping("/showAllGreetings")
	public Collection<Greeting> getAllGreetings(){
    	Greeting greetingObject=
    			new Greeting("<h1 style='background-color:violet'; color:white;>Happy New Year<h1>/",LocalDate.of(2025, 1, 1));
    	Greeting greetingObject2=
    			new Greeting("<h1 style='background-color:violet; color:white;'>Bye Bye 2024<h1>/",LocalDate.of(2024, 12, 31));
    	Greeting greetingObject3=
    			new Greeting("<h1 style='background-color:violet; color:white;'>Jay Shree Ram<h1>/",LocalDate.of(2024,4, 22));
     Collection<Greeting> allGreeting=Arrays.asList(greetingObject,greetingObject2,greetingObject3);
     return allGreeting;
	}

}
