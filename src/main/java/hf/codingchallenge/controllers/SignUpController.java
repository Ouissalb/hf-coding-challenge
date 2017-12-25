package hf.codingchallenge.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

	@GetMapping(value="/signup")
	public String signup()
	{
		return "signup";
	}
}
