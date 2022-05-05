package br.inatel.myrestapi.MyRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestApiApplication.class, args);
	}

}

//A anotação @SpringBootApplication, susbstitui essas outras três
//@Configuration, 
//@EnableAutoConfiguration, 
//@ComponentScan