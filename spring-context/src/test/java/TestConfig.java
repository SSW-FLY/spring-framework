import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	@Bean
	public String isSuccess() {
		return "Hello Spring success";
	}


	public String getHello() {
		return "hello";
	}


}
