package com.dream.mail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-22
 * Time: 上午11:53
 */
public class MailTest {
    private ApplicationContext context;

    @Before
    public void init() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:testMail.xml");
    }

    @Test
    public void testSendMail() throws Exception {
        JavaMailSender mailSender = context.getBean("mailSender", JavaMailSender.class);
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("zhong.gang@jiajiao007.com");
        mailMessage.setTo("120859274@qq.com");
        mailMessage.setSubject("Hello world");
        mailMessage.setText("Hello world!");
        mailSender.send(mailMessage);
    }
}
