package in.ashokit.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	private Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@GetMapping("/book")
	public String bookController(Model model) throws SQLException
	{
		model.addAttribute("msg", "Java Books available");
		
		
		
		return "index";
	}
	

}
