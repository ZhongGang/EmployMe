package com.dream.mail.impl;

import com.dream.mail.SimpleMailSender;
import com.dream.util.ValidateUtil;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-23
 * Time: 下午4:38
 */
public class SimpleMailSenderImpl extends JavaMailSenderImpl implements SimpleMailSender {
    private String defaultFromAddress;
    private String defaultToAddress;

    public void sendMail(SimpleMailMessage mailMessage) {
        mailMessage.setFrom(defaultFromAddress);
        if (!ValidateUtil.isEmptyText(defaultToAddress)) {
            mailMessage.setTo(defaultToAddress);
        }
        send(mailMessage);
    }

    public void setDefaultFromAddress(String defaultFromAddress) {
        this.defaultFromAddress = defaultFromAddress;
    }

    public void setDefaultToAddress(String defaultToAddress) {
        this.defaultToAddress = defaultToAddress;
    }
}
