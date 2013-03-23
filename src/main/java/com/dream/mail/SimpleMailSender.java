package com.dream.mail;

import org.springframework.mail.SimpleMailMessage;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-23
 * Time: 下午4:38
 */
public interface SimpleMailSender {

    void sendMail(SimpleMailMessage mailMessage);
}
