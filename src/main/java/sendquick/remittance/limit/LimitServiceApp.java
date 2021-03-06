package sendquick.remittance.limit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sendquick.remittance.limit.domain.AccountLimit;

/**
 * @author narayana
 */
@SpringBootApplication
public class LimitServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(LimitServiceApp.class, args);
	}

}
