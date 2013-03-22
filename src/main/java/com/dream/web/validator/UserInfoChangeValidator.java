package com.dream.web.validator;

import com.dream.dto.user.UserInfoChangeDTO;
import com.dream.util.ValidateUtil;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-17
 * Time: 下午2:28
 */
public class UserInfoChangeValidator implements Validator {
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean supports(Class<?> clazz) {
        return UserInfoChangeDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserInfoChangeDTO userInfoChangeDTO = (UserInfoChangeDTO) target;

        String nickname = userInfoChangeDTO.getNickname();
        if (ValidateUtil.isEmptyText(nickname)) {
            errors.rejectValue("nickname", null, "Nickname should not be empty!");
        }

        String oldPassword = userInfoChangeDTO.getOldPassword();
        if (!ValidateUtil.isEmptyText(oldPassword)) {
            if (!userInfoChangeDTO.isSamePassword(passwordEncoder)) {
                errors.rejectValue("oldPassword", null, "Old password is not the same as original password!");
            }

            String newPassword = userInfoChangeDTO.getNewPassword();
            if (ValidateUtil.isEmptyText(newPassword)) {
                errors.rejectValue("newPassword", null, "New password should not be empty!");
            }
        }

        String email = userInfoChangeDTO.getEmail();
        if (ValidateUtil.isEmptyText(email)) {
            errors.rejectValue("email", null, "Email should not be empty!");
        } else {
            if (!ValidateUtil.isEmail(email)) {
                errors.rejectValue("email", null, "The format of email is wrong!");
            }
        }
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
}
