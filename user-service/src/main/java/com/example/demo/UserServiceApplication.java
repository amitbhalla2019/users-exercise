package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.save(new User(111L, "Amit", "Bhalla", new Date(), "Mr."));
		repository.save(new User(123L, "Amit", "Kumar", new Date(), "Mr."));
		repository.save(new User(101L, "Amit", "Jain", new Date(), "Mr."));
		repository.save(new User(135L, "Ajay", "Bhalla", new Date(), "Mr."));
		repository.save(new User(246L, "Anuj", "Thakur", new Date(), "Mr."));
		repository.save(new User(999L, "Atul", "Yadav", new Date(), "Mr."));
		repository.save(new User(999L, "Hema", "Chopra", new Date(), "Ms."));
		repository.save(new User(999L, "Piya", "Roshan", new Date(), "Ms."));
		repository.save(new User(999L, "Neha", "Gupta", new Date(), "Ms."));
	}

}