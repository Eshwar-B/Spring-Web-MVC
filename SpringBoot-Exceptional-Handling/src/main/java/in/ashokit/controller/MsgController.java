package in.ashokit.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MsgController {

	private Logger logger = LoggerFactory.getLogger(MsgController.class);
	
	
	@GetMapping("/welcome")
	public String welcomeMsgController(Model model) throws Exception
	{
		
		model.addAttribute("msg","welcome to tech mahindra!");
		
//		int i = 10 / 0;
		
		throw new SQLException();
		
//		return "index";
	}
	
}
