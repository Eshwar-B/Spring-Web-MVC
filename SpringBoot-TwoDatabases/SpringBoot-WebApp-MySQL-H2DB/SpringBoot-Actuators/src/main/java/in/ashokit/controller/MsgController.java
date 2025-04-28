package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MsgController {

	@GetMapping("/")
	public String hello()
	{
		return "Hello World";
	}
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to Spring Boot";
	}
}
