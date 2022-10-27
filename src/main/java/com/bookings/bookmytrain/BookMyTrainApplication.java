package com.bookings.bookmytrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyTrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyTrainApplication.class, args);
		Person person = context.getBean(Person.class);
		System.out.println(person.getFirstname());
	}

}
