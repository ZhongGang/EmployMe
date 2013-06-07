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
            errors.rejectValue("username", null, "账号不能为空");
        } else {
            boolean exist = userService.existUsername(username);
            if (exist) {
                errors.rejectValue("username", null, "账号已存在");
            }
        }

        String password = registrationDTO.getPassword();
        if (ValidateUtil.isEmptyText(password)) {
            errors.rejectValue("password", null, "密码不能为空");
        }

        String nickname = registrationDTO.getNickname();
        if (ValidateUtil.isEmptyText(nickname)) {
            errors.rejectValue("nickname", null, "呢称不能为空");
        }

        String email = registrationDTO.getEmail();
        if (ValidateUtil.isEmptyText(email)) {
            errors.rejectValue("email", null, "邮件地址不能为空");
        } else {
            if (ValidateUtil.isEmail(email)) {
                boolean exist = userService.emailExist(email);
                if (exist) {
                    errors.rejectValue("email", null, "邮件地址已存在");
                }
            } else {
                errors.rejectValue("email", null, "邮件地址格式有误");
            }
        }
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
