package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.EmailService;

/**
 * This class contains a Mail API developed using Spring Boot
 * 
 * @author MukulJaiswal
 *
 */
@RestController
public class SendEmailController {

	@Autowired
	private EmailService notificationService;

	@Autowired
	private User user;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="ping",method = RequestMethod.GET , produces = "text/html")
	public String ping() {
		return "Congratulations! Your mail has been send to the user.";
	}
	
	@RequestMapping("send-mail")
	public String send() {

		/*
		 * Creating a User with the help of User class that we have declared and setting
		 * Email address of the sender.
		 */
		user.setToEmailAddress("rshanmugi@gmail.com");  //Receiver's email address
		/*
		 * Here we will call sendEmail() for Sending mail to the sender.
		 */
		try {
			notificationService.sendEmail(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}

	/**
	 * 
	 * @return
	 * @throws MessagingException
	 */
	/*@RequestMapping("send-mail-attachment")
	public String sendWithAttachment() throws MessagingException {

		
		 * Creating a User with the help of User class that we have declared and setting
		 * Email address of the sender.
		 
		user.setToEmailAddress("mukul.jaiswal786@gmail.com"); //Receiver's email address

		
		 * Here we will call sendEmailWithAttachment() for Sending mail to the sender
		 * that contains a attachment.
		 
		try {
			notificationService.sendEmailWithAttachment(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}*/
}
