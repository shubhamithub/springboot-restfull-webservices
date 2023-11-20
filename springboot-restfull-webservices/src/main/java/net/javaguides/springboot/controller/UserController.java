package net.javaguides.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entities.User;
import net.javaguides.springboot.service.UserService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {
	
	private UserService userService;
	
	
	@PostMapping
	public ResponseEntity<User> createUserEntity( @RequestBody User user){
		User saveUser= userService.createUser(user);
		return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
		
	}

}
