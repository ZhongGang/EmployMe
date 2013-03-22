package com.dream.web.validator;

import com.dream.dto.user.registration.RegistrationDTO;
import com.dream.service.UserService;
import com.dream.util.ValidateUtil;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午3:00
 */
public class RegisterValidator implements Validator {
    private UserService userService;

    @Override
    public boolean supports(Class<?> clazz) {
        return RegistrationDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RegistrationDTO registrationDTO = (RegistrationDTO) target;

        String username = registrationDTO.getUsername();
        if (ValidateUtil.isEmptyText(username)) {
            errors.rejectValue("username", null, "Username must not be empty!");
        } else {
            boolean exist = userService.existUsername(username);
            if (exist) {
                errors.rejectValue("username", null, "Username has existed!");
            }
        }

        String password = registrationDTO.getPassword();
        if (ValidateUtil.isEmptyText(password)) {
            errors.rejectValue("password", null, "Password must not be empty!");
        }

        String nickname = registrationDTO.getNickname();
        if (ValidateUtil.isEmptyText(nickname)) {
            errors.rejectValue("nickname", null, "Nickname must not be empty!");
        }

        String email = registrationDTO.getEmail();
        if (ValidateUtil.isEmptyText(email)) {
            errors.rejectValue("email", null, "Email must not be empty!");
        } else {
            if (ValidateUtil.isEmail(email)) {
                boolean exist = userService.emailExist(email);
                if (exist) {
                    errors.rejectValue("email", null, "Email has existed!");
                }
            } else {
                errors.rejectValue("email", null, "The format of email is wrong!");
            }
        }
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
