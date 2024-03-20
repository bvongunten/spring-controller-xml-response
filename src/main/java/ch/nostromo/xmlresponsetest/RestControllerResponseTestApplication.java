package ch.nostromo.xmlresponsetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class RestControllerResponseTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestControllerResponseTestApplication.class, args);
	}
}
