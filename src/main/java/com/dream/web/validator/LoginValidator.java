package com.dream.web.validator;

import com.dream.dto.user.login.LoginDTO;
import com.dream.util.ValidateUtil;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-16
 * Time: 下午5:42
 */
public class LoginValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return LoginDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginDTO loginDTO = (LoginDTO) target;

        String username = loginDTO.getUsername();
        if (ValidateUtil.isEmptyText(username)) {
            errors.rejectValue("username", null, "Username must not be empty!");
        }

        String password = loginDTO.getPassword();
        if (ValidateUtil.isEmptyText(password)) {
            errors.rejectValue("password", null, "Password must not be empty!");
        }
    }
}
