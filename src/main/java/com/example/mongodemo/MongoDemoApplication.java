package com.example.mongodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//@EnableMongoRepositories
@SpringBootApplication
public class MongoDemoApplication {//implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		System.out.println(userRepository);
//		User user= new User();
//		user.setName("Revati");
//		user.setDate("02.04.1999");
//		userRepository.save(user);
//	}

}
