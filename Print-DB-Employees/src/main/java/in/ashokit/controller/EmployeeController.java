package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.Employee;
import in.ashokit.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	public EmployeeService empService; 
	
	@GetMapping("/employees")
	public String printAllEmployees(Model model)
	{
		List<Employee> allEmployees = empService.getAllEmployees();
		
		model.addAttribute("employees",allEmployees);
		
		return "employees_table";
	}
	
}
