package com.example.Api_Votaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiVotacionesApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ApiVotacionesApplication.class, args);
		//PersonalRepository repository1 = context.getBean(PersonalRepository.class);


	}

}
