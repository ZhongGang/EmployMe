package com.dream.dto.user;

import com.dream.domain.user.User;
import com.dream.util.ValidateUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.encoding.PasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-17
 * Time: 上午11:15
 */
@Data
@NoArgsConstructor
public class UserInfoChangeDTO {
    private String userGuid;
    private String nickname;
    private String email;
    private String oldPassword;
    private String newPassword;
    private String originalPassword;

    public UserInfoChangeDTO(User user) {
        this.userGuid = user.guid();
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.originalPassword = user.getPassword();
    }

    public boolean isShouldChangePassword() {
        return !ValidateUtil.isEmptyText(this.newPassword);
    }

    public boolean isSamePassword(PasswordEncoder passwordEncoder) {
        return this.originalPassword.equals(passwordEncoder.encodePassword(oldPassword, null));
    }
}
