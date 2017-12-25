package hf.codingchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hf.codingchallenge.entities.User;
import hf.codingchallenge.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User signUp(User user) {
		 return userRepository.save(user);
}
	
	public User editUser(User user) {
		 return userRepository.save(user);
}
	
	
}
