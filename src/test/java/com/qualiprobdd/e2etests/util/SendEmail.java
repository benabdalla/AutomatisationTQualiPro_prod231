package com.qualiprobdd.e2etests.util;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void Send() {

		final String username = "";
		final String password = "";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "");
		props.put("mail.smtp.port", "");
		props.put("java.net.preferIPv4Stack", "true");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(""));
			message.setSubject("Test Report");

			BodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("Body text");

			// create new MimeBodyPart object and set DataHandler object to this object
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			String filename = "target/cucumber-html-report/index.html";// change accordingly
			DataSource source = new FileDataSource(filename);
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart2.setFileName(filename);

			/*
			 * // create Multipart object and add MimeBodyPart objects to this object
			 * Multipart multipart = new MimeMultipart();
			 * multipart.addBodyPart(messageBodyPart1);
			 * multipart.addBodyPart(messageBodyPart2);
			 * 
			 * // set the multiplart object to the message object
			 * message.setContent(multipart );
			 */
			Transport.send(message);

			System.out.println("Mail Sent Successfully");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
