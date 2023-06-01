package com.jpa.test;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>{

	org.springframework.boot.autoconfigure.security.SecurityProperties.User save(
			org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

//	org.springframework.boot.autoconfigure.security.SecurityProperties.User save(
//			org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

	//org.springframework.boot.autoconfigure.security.SecurityProperties.User saveAll(Iterable<S> user);

	//org.springframework.boot.autoconfigure.security.SecurityProperties.User save(
	//		org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

	
	
	 

}
