package in.ashokit.exception;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);
	
	
	@ExceptionHandler(value = Exception.class)
	public String handleAppexceptions(Exception e, Model model)
	{
		model.addAttribute("msg", "unknown exception");
		logger.error(e.getMessage());
		return "errorpage";
	}
	
	@ExceptionHandler(value = SQLException.class)
	public String handleSQLException(SQLException e, Model model)
	{
		model.addAttribute("msg", "SQL exception");
		logger.error(e.getMessage());
		return "errorpage";
	}
	
	@ExceptionHandler(value = BookNotFoundException.class)
	public String handleBookNotFoundException(BookNotFoundException e,Model model)
	{
		model.addAttribute("msg", "Book not found");
		logger.error(e.getMessage());
		return "errorpage";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNPE(NullPointerException e, Model model)
	{
		model.addAttribute("msg", "null pointer exception");
		logger.error(e.getMessage());
		return "errorpage";
	}
}
