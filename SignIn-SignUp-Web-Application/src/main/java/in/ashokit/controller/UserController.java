package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	
	@GetMapping("/signUp")
	public String showSignUpForm(Model model)
	{
		model.addAttribute("user", new User());
		return "signUp";
	}
	
	@PostMapping("/signUp")
	public String processSignUp(@ModelAttribute User user)
	{
		userRepo.save(user);
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model)
	{
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/login")
	public String processLogin(@ModelAttribute User user, Model model)
	{
		User userByEmail = userRepo.findByEmail(user.getEmail());
		
		if(userByEmail != null && userByEmail.getPwd().equals(user.getPwd())) {
			model.addAttribute("email", userByEmail.getEmail());
			return "welcome";
		} else {
			model.addAttribute("error", "Invalid credentials");
			return "login";
		}
	}
	
}
