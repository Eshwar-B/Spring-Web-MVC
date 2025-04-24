package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String showLoginForm(Model model, User user) 
	{
		
		model.addAttribute("user",user);
		
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(Model model, @ModelAttribute("user")User user)
	{
		User validatedUser = userService.validateUser(user.getEmail(), user.getPwd());
		
		if(validatedUser != null){
			model.addAttribute("name", "Welcome to our Web Application");
			return "welcome";
		} else {
			model.addAttribute("name", "Invalid Credentials");
			return "login";
		}
	}
	
	@GetMapping("/register")
	public String showRegisterForm(Model model, User user) {
		model.addAttribute("user", user);
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") User user){
		userService.saveUser(user);
		return "redirect:/login";
	}
	
}
