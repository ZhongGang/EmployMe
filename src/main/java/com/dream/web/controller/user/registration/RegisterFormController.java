package com.dream.web.controller.user.registration;

import com.dream.dto.user.registration.RegistrationDTO;
import com.dream.service.UserService;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午1:34
 */
public class RegisterFormController extends SimpleFormController {
    private UserService userService;

    public RegisterFormController() {
        setCommandClass(RegistrationDTO.class);
        setCommandName("registration");
        setFormView("user/registrationForm");
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        RegistrationDTO registrationDTO = (RegistrationDTO) command;
        userService.createApplicant(registrationDTO);
        return new ModelAndView("redirect:/login");
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
