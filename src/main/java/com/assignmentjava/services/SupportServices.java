package com.assignmentjava.services;

import com.assignmentjava.model.Mail;

import javax.mail.MessagingException;

public interface SupportServices {
    String getBCryptPasswordEndCoder(String normalPassword);

    void sendEmail(Mail mail) throws MessagingException;
}
