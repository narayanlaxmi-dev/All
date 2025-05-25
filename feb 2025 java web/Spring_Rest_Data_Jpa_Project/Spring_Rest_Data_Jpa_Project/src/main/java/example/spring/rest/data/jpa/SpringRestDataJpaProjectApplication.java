package example.spring.rest.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="book_library")
@EnableJpaRepositories(basePackages="book_library")
@EntityScan(basePackages="book_library")
public class SpringRestDataJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataJpaProjectApplication.class, args);
	}

}
