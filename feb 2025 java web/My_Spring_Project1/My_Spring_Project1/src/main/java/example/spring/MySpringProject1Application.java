package example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="book_library")
public class MySpringProject1Application {

	public static void main(String[] args) {
		
		SpringApplication.run(MySpringProject1Application.class, args);
	}

}
