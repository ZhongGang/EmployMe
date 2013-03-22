package com.dream.dto.user;

import com.dream.domain.user.User;
import com.dream.util.ValidateUtil;
import org.springframework.security.authentication.encoding.PasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-17
 * Time: 上午11:15
 */
public class UserInfoChangeDTO {
    private String userGuid;
    private String nickname;
    private String email;
    private String oldPassword;
    private String newPassword;
    private String originalPassword;

    public UserInfoChangeDTO() {
    }

    public UserInfoChangeDTO(User user) {
        this.userGuid = user.guid();
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.originalPassword = user.getPassword();
    }

    public boolean isShouldChangePassword() {
        return !ValidateUtil.isEmptyText(this.newPassword);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getUserGuid() {
        return userGuid;
    }

    public String getOriginalPassword() {
        return originalPassword;
    }

    public boolean isSamePassword(PasswordEncoder passwordEncoder) {
        return this.originalPassword.equals(passwordEncoder.encodePassword(oldPassword, null));
    }
}
