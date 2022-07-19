package org.example.SwaggerDocExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
public class SwaggerDocExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerDocExampleApplication.class, args);
	}

}
