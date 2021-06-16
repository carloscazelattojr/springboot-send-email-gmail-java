package br.com.carlosjunior.sendemail.service;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	JavaMailSender javaMailSender;

	public String sendEmail() {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("carlosjuniorspringboot@gmail.com");
		message.setTo("carlosjuniorspringboot@gmail.com");
		message.setSubject("Test send Email with SpringBoot");
		message.setText("Here text message body");

		javaMailSender.send(message);

		return "Mail send successfully";

	}

	public String sendEmailwithAttachment() {
		try {
			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);

			messageHelper.setFrom("carlosjuniorspringboot@gmail.com");
			messageHelper.setTo("carlosjuniorspringboot@gmail.com");
			messageHelper.setSubject("Subject with Attachment");
			messageHelper.setText("Here text message body Attachment");

			File file = new File("C:\\temp\\anexo.txt");

			messageHelper.addAttachment(file.getName(), file);

			javaMailSender.send(message);
			return "Mail(Attachment) send successfully";

		} catch (Exception e) {
			return "Mail send failed";
		}
	}

}
