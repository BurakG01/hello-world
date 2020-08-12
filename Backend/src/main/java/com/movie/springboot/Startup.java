package com.movie.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class Startup {
	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
}
