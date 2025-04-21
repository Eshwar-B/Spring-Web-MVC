package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	// Empty Form 
	@GetMapping("/")
	public String index(Model model)
	{
		User user = new User();
		
		model.addAttribute("user",user);
		
		return "index";
	}
	
	@PostMapping("/user")
	public String saveUser(User user, Model model)
	{
		boolean allAvailable = true;
		
		if(user.getName() == "" || user.getEmail() == "" || user.getPhno() == null || user.getPwd() == "") {
			model.addAttribute("empty","Fill all the details");
			allAvailable  = false;
		}
		
		boolean isSaved = false;
		if(allAvailable) {		
			isSaved = userService.saveUser(user);
		}
		
		if(isSaved) {
			model.addAttribute("smsg","User saved");
		} else {
			model.addAttribute("emsg","User not saved");
		}
		
		return "index";
	}
	
		
}
