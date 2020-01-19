package pt.rafavr.udaplaymaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdaApplication.class, args);
	}
}
