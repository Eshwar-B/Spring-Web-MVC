package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.exception.BookNotFoundException;

@Controller
public class ProductController 
{
	@GetMapping("/product")
	public String productController(@RequestParam("pid") Integer pid, Model model) throws Exception
	{
		if(pid == 1) {
			model.addAttribute("msg", "Product name : Apple");
		} else {
			throw new BookNotFoundException("Product not found");
		}
		
		return "index";
	}
}
