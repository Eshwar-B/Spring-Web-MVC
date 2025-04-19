package in.ashokit.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(String subject, String body, String to)
	{
		try {
				
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			
			mimeMessageHelper.setSubject(subject);
			mimeMessageHelper.setText(body, true);
			mimeMessageHelper.setTo(to);
			
			mimeMessageHelper.addAttachment("SBMS notes", new File("D:\\Annual Day 2025\\IMG-20250309-WA0038.jpg"));
			
			mailSender.send(mimeMessage);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
