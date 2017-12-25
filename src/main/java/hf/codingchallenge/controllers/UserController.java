package hf.codingchallenge.controllers;

import java.lang.reflect.Array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Forms.UserSignUp;
import hf.codingchallenge.entities.User;
import hf.codingchallenge.repositories.UserRepository;
import hf.codingchallenge.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	private UserService userService;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@PutMapping
	public void insert(@RequestBody User user) {
		this.userService.save(user);
	}

	
    @PostMapping(value = "/register")
    public String register(@RequestBody UserSignUp userSignUp){
    	Array coordinates = userService.getLocationFromIp(userSignUp.getIp());
        userService.save(new User(userSignUp.getEmail(), userSignUp.getPassword(), null,null, null));
        return "User created";
}
	
	
	@PostMapping
	public void update(@RequestBody User user) {
		this.userService.editUser(user);
	}
	

	@GetMapping(value = "/users/{id}")
	public User getOneById(String id) {
		return userService.getOneById(id);
}
	
	

	
	
}
