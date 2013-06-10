package com.dream.dto.user.registration;

import com.dream.domain.user.Applicant;
import com.dream.domain.user.User;
import lombok.Data;
import org.springframework.security.authentication.encoding.PasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午1:39
 */
@Data
public class RegistrationDTO {
    private String username;
    private String password;
    private String nickname;
    private String email;

    public User toNewApplicant(PasswordEncoder passwordEncoder) {
        String password = passwordEncoder.encodePassword(this.password, null);
        return new Applicant(this.username, password, this.nickname, this.email);
    }
}
