package com.poc.practice.spring.security.jwt;

import com.poc.practice.spring.security.jwt.entity.User;
import com.poc.practice.spring.security.jwt.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	@Autowired
	UserRepository userRepository;

	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(new User(1,"A","AA","a@mail.com"),
									 new User(2,"B","BB","b@mail.com"),
									 new User(3,"C","CC","c@mail.com"),
									 new User(4,"D","DD","d@mail.com"),
									 new User(5,"E","EE","e@mail.com"),
									 new User(6,"F","FF","f@mail.com")
									).collect(Collectors.toList());
		userRepository.saveAll(users);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

}
