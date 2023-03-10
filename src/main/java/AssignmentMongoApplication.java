import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
@EntityScan("com.example.*")
public class AssignmentMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentMongoApplication.class, args);
	}

}
