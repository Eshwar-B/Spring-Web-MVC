package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	public MsgController()
	{
		System.out.println("Msg Controller :: constrcutor executed...");
	}
	
	@GetMapping("/hello")
	public ModelAndView newMsg()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Hello World !!");
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/welcome")
	public ModelAndView greetMsg()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to Spring Web Application !!");
		mav.setViewName("index");
		
		return mav;
	}
	
}
