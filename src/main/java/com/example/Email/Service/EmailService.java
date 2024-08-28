package com.example.Email.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender javamailsender;
	
	@Value("$(spring.mail.host)")
	private String fromEmail;
	
	public void sendEmail(String recipent,String body,String subject,String cc) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(fromEmail);
		message.setTo(recipent);
		message.setText(body);
		message.setSubject(subject);
		message.setCc(cc);
		javamailsender.send(message); 
		
	}
}
