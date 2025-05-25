package example.spring;

import java.time.LocalDate;

public class Greeting {

	private String content;
	private LocalDate dateOfGreeting;
   
public Greeting() {

}

public Greeting(String content, LocalDate dateOfGreeting) {
	super();
	this.content = content;
	this.dateOfGreeting = dateOfGreeting;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public LocalDate getDateOfGreeting() {
	return dateOfGreeting;
}

public void setDateOfGreeting(LocalDate dateOfGreeting) {
	this.dateOfGreeting = dateOfGreeting;
}	

}
