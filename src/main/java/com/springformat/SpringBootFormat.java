/*
 * @author Fabiano Freitas
 */
package com.springformat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springformat.entity.User;
import com.springformat.repository.UserRepository;

/**
 * 
 */
@SpringBootApplication
public class SpringBootFormat implements CommandLineRunner {

	/**
	 * 
	 */
	@Autowired
	private UserRepository repository;

	/**
	 * 
	 *
	 * @param args 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFormat.class, args);
	}

	/**
	 * 
	 *
	 * @param args 
	 * @throws Exception 
	 */
	@Override
	public void run(String... args) throws Exception {

		User user1 = new User("Ryan", "Lyon", 45, "Student", "Harvard", "Av. Italy Rand", "Chicago", "USA", "4444444");
		User user2 = new User("Cris", "Matt", 35, "Teacher", "Harvard", "Av. Chanton Red", "Florida", "USA", "3333333");
		User user3 = new User("Mary", "Amir", 25, "Enginner", "Google", "Av. Marchest Land", "Florida", "USA","2222222");
		User user4 = new User("Ryan", "Lyon", 45, "Student", "Harvard", "Av. Italy Rand", "Chicago", "USA", "4444444");
		User user5 = new User("Cris", "Matt", 35, "Teacher", "Harvard", "Av. Chanton Red", "Florida", "USA", "3333333");
		User user6 = new User("Mary", "Amir", 25, "Enginner", "Google", "Av. Marchest Land", "Florida", "USA","2222222");

		repository.save(user1);
		repository.save(user2);
		repository.save(user3);
		repository.save(user4);
		repository.save(user5);
		repository.save(user6);

	}

}
