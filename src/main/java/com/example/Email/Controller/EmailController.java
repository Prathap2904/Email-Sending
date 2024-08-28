package com.example.Email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Email.Dto.EmailMessage;
import com.example.Email.Service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailservice;
	
	/*@GetMapping("sendemail")
	public String sendEmail() {
		emailservice.sendEmail("prathap2904@gmail.com", "Hi,Hello", "apply");
		return "mail sent successfully";
	}*/
	
	@PostMapping("postMail")
	public String postMail(@RequestBody EmailMessage emailMessage) {
		emailservice.sendEmail(emailMessage.getMailTo(), emailMessage.getBody(), emailMessage.getSubject(),emailMessage.getCc());
		return "Mail Successfully sended";
	}
	
	
}
