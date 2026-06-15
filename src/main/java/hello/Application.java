package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")

	public String home() {

		return "test wjyoo";

	}

	@RequestMapping("/error500")
	public String error500() {
		throw new RuntimeException("Force 500 error for SRE rollback test");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
