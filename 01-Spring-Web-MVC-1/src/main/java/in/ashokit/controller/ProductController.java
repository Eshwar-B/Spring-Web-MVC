package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {

	public ProductController()
	{
		System.out.println("Product controller :: constructor executed...");
	}
	
	@GetMapping("/product")
	public ModelAndView productPrice()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("price", "Samsung Price :: 55000");
		mav.setViewName("index");
		
		return mav;
	}
	
}
