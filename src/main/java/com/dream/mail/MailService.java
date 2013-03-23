package com.dream.mail;

import com.dream.domain.user.User;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-23
 * Time: 下午4:43
 */
public interface MailService {

    void sendRegistrationMail(User user);
}
