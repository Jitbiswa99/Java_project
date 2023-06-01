package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
	
	UserRepository userrepo =context.getBean(UserRepository.class);
	
	User user = new User();
	
	user.setName("Biswajit Adhikary");
   //user.setCity("Kolkata");
//	user.setStatus("I am Msd fan");
	
	User user1 = userrepo.save(user);
	
	System.out.println(user1);
	
	}

}
