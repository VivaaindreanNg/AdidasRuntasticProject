package com.webapp.adidasruntastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration
@ComponentScan({ "com.webapp.adidasruntastic" })
@EnableMongoRepositories("com.webapp.adidasruntastic.repository")
@SpringBootApplication
public class AdidasRuntasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdidasRuntasticApplication.class, args);
	}

}
