package com.pennant.propertystudio.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component
public class SendMailing {

	private JavaMailSender mailSender;

	private CreateTemplate createTemplate;

	@Value("${spring.mail.username}")
	private String from;

	@Autowired
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Autowired
	public void setCreateTemplate(CreateTemplate createTemplate) {
		this.createTemplate = createTemplate;
	}

	public void sendMail(String email, String subject, String content) throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
		helper.setFrom(from);
		helper.setTo(email);
		helper.setSubject(subject);
		helper.setText(content, true);
		mailSender.send(message);
		System.out.println("SendMailing.sendMail()");
	}

	public void sendOtpVerifcation(String email, String subject, String data) {
		String content = createTemplate.emailVerification(data);
		Thread t = new Thread(()->{
			try {
				sendMail(email, subject, content);
			} catch (MessagingException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		});
		t.start();
	}

	public void paymentVerification(String email, String subject, String name, String amount, String orderId,
			String paymentId) {
		String content = createTemplate.paymentConfirmation(name, amount, orderId, paymentId);
		Thread t = new Thread(()->{
			try {
				sendMail(email, subject, content);
			} catch (MessagingException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		});
		t.start();
	}

	public void passwordUpdate(String email, String subject, String name) {
		String content = createTemplate.passwordUpdateConfirmation(name, email);
		Thread t = new Thread(()->{
			try {
				sendMail(email, subject, content);
			} catch (MessagingException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		});
		t.start();
	}
}
