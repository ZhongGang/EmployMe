package com.dream.dto.user.registration;

import com.dream.domain.user.Applicant;
import com.dream.domain.user.User;
import org.springframework.security.authentication.encoding.PasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午1:39
 */
public class RegistrationDTO {
    private String username;
    private String password;
    private String nickname;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User toNewApplicant(PasswordEncoder passwordEncoder) {
        String password = passwordEncoder.encodePassword(this.password, null);
        return new Applicant(this.username, password, this.nickname, this.email);
    }
}
