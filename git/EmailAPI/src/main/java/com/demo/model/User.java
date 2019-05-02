package com.demo.model;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Component
public class User {
	@Valid
	private String toEmailAddress;
	
	@NotEmpty
	private String subject;
	
	@NotEmpty
	private String messageBody;
	
	public String getToEmailAddress() {
		return toEmailAddress;
	}

	public void setToEmailAddress(String toEmailAddress) {
		this.toEmailAddress = toEmailAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	

}
