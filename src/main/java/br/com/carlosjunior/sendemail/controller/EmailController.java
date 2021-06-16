package br.com.carlosjunior.sendemail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosjunior.sendemail.service.EmailService;

@RestController
@RequestMapping("/api")
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	
	@GetMapping("/sendEmail")
	public String sendEmail() {
		return "";
	}
	
}
