package com.example.Email.Dto;

public class EmailMessage {
	
	private String mailTo;
	private String body;
	private String subject;
	private String cc;
	public EmailMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailMessage(String mailTo, String body, String subject, String cc) {
		super();
		this.mailTo = mailTo;
		this.body = body;
		this.subject = subject;
		this.cc = cc;
	}
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "EmailMessage [mailTo=" + mailTo + ", body=" + body + ", subject=" + subject + ", cc=" + cc + "]";
	}
	
	
}
