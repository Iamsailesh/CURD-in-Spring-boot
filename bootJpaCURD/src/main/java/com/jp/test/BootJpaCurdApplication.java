package com.jp.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jp.test.dao.UserRepository;
import com.jp.test.entities.User;

@SpringBootApplication
public class BootJpaCurdApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootJpaCurdApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		//--------CREATE---------
		//creating objects of User1
		User user= new User();
		user.setName("Sailesh Nepal");
		user.setAddress("Jhapa, Nepal");
		user.setStatus("I am learning java");
		userRepository.save(user);
//	   
//		User1 user1= new User1();
//		user1.setName("Sarvesh Dhakal");
//		user1.setCity("Butwal");
//		user1.setStatus("I am learning react js");
//	 
//	    User1 user2= new User1();
//		user2.setName("Sanush Shakya");
//		user2.setCity("Bktp");
//		user2.setStatus("I am learning Artificial Intillegence");
//		
//		//to save multiple objects
//	    List<User1> users= List.of(user, user1, user2);
//	    userRepository.saveAll(users);
		
		
		
		
		
		
		
	    //---------UPDATE------------
		//UPDATE THE STATUS OF USER 404
//		Optional<User1> optional=userRepository.findById(404);
//		
//		User1 userr=optional.get();
//		userr.setStatus("I am currently learnig AI");
//		userRepository.save(userr);
//		System.out.println(userr);
		
		//----------Read Data------
		//optional.get() garera aghi gariyo
		//if sabai chainx optional.findAll()
		
//		Iterable<User1> iterable=userRepository.findAll();
//		iterable.forEach(user->{
//			System.out.println(user);
//		}
//		
//				);
		
		//-------DELETE-------
		
//		userRepository.deleteById(402); //this is deleting a single componetnt of database
		
		//i have fetch all the data and deleted the one whose id are even.
//		Iterable<User> iter=userRepository.findAll();
//		
//		iter.forEach(user->{
//			if(user.getId()%2==0) {
//				userRepository.delete(user);
//			}
//		});
 


	}

}
