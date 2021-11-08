package mx.com.telcel.userrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mx.com.telcel.userrol")
public class CrudUserRolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudUserRolApplication.class, args);
	}

}
