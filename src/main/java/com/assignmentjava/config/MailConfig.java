package com.assignmentjava.config;

import com.assignmentjava.services.DotEnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

//@Configuration
public class MailConfig {

//    @Autowired
//    DotEnvService dotEnvService;
//    @Bean
//public JavaMailSender getJavaMailSenderImpl(){
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost(dotEnvService.getDotEnvValue("MAIL_HOST"));
//        mailSender.setPort(Integer.parseInt(dotEnvService.getDotEnvValue("MAIL_PORT")));
//        mailSender.setUsername(dotEnvService.getDotEnvValue("MAIL_USERNAME"));
//        mailSender.setPassword(dotEnvService.getDotEnvValue("MAIL_PASSWORD"));
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.debug", "true");
//        return mailSender;
//    }
}
