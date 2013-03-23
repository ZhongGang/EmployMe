package com.dream.mail.impl;

import com.dream.domain.user.User;
import com.dream.mail.MailService;
import com.dream.mail.SimpleMailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-23
 * Time: 下午4:43
 */
public class MailServiceImpl implements MailService {
    private SimpleMailSender mailSender;

    @Override
    public void sendRegistrationMail(User user) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("Successful registration");
        mailMessage.setText("Thanks for your registration!");
        mailMessage.setTo(user.getEmail());
        mailSender.sendMail(mailMessage);
    }

    public void setMailSender(SimpleMailSender mailSender) {
        this.mailSender = mailSender;
    }
}
