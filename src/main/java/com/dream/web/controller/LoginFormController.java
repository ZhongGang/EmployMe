package com.dream.web.controller;

import com.dream.dto.user.login.LoginDTO;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午9:09
 */
public class LoginFormController extends SimpleFormController {

    public LoginFormController() {
        setCommandClass(LoginDTO.class);
        setCommandName("login");
        setFormView("login");
    }

    @Override
    protected Map referenceData(HttpServletRequest request, Object command, Errors errors) throws Exception {
        Integer errorCode = ServletRequestUtils.getIntParameter(request, "errorCode");
        Map model = new HashMap();
        model.put("errorCode", errorCode);
        return model;
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        return new LoginDTO();
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login/check");
        dispatcher.forward(request, response);
        return null;
    }
}
