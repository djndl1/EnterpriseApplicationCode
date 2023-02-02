package sia.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // a spring boot app
// @SpringBootConfiguration, a specialized @Configuration
// @EnableAutoConfiguration autoconfiguration
// @ComponentScan eanble component scanning so that certain classes can be added to the application context automatically
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
