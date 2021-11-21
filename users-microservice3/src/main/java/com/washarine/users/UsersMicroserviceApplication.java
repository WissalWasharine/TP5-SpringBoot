package com.washarine.users;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.washarine.users.entities.Role;
import com.washarine.users.entities.User;
import com.washarine.users.service.UserService;

@SpringBootApplication
public class UsersMicroserviceApplication {
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

	@PostConstruct
	void init_users() {
/*
	//jouer les rôles
	userService.addRole(new Role(null,"ADMIN"));
	userService.addRole(new Role(null,"USER"));
	
	//ajouter les users
	userService.saveUser(new User(null,"Wissal","246",true,null));
	userService.saveUser(new User(null,"Ahmed","123",true,null));
	userService.saveUser(new User(null,"Yassine","123",true,null));
	
	//ajouter les rôles aux users
	userService.addRoleToUser("Wissal", "ADMIN");
	userService.addRoleToUser("Yassine", "USER");
	userService.addRoleToUser("Ahmed", "USER");
	userService.addRoleToUser("Yassine", "USER");*/
	} 
	@Bean
	BCryptPasswordEncoder getBCE() {
	return new BCryptPasswordEncoder();
	}

	
	



}
