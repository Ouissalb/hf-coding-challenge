package hf.codingchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import hf.codingchallenge.entities.User;
import hf.codingchallenge.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
}
    
	public User save(User user) {
		user.setPassword(passwordEncoder().encode(user.getPassword()));
		 return userRepository.save(user);
}
	
	public User editUser(User user) {
		 return userRepository.save(user);
}
	
	public User getOneById(String id) {
		return userRepository.findOne(id);
}
	
}
