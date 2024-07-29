package com.example.tarea_MongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TareaMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaMongoDbApplication.class, args);
	}

}
