package com.dream.util;

import org.junit.Test;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-20
 * Time: 下午7:56
 */
public class PasswordEncoderTest {

    @Test
    public void testEncodePassword() throws Exception {
        PasswordEncoder md5 = new Md5PasswordEncoder();
        String encryptPassword = md5.encodePassword("SuperAdministrator", null);
        System.out.println(encryptPassword);
    }
}
