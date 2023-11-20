package net.javaguides.springboot.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entities.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.UserService;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
