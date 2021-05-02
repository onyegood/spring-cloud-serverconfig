package pluralsite.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PluralsiteSpringcloudM2ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsiteSpringcloudM2ConfigserverApplication.class, args);
	}

}
