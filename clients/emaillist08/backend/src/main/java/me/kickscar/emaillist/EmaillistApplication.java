package me.kickscar.emaillist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmaillistApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmaillistApplication.class, args);
	}
	
	//
	// @LoadBalanced: GateWay 사용
	//
	@Bean
	public RestTemplate restTemplte() {
		return new RestTemplate();
	}
}
