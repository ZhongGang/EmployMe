package com.dream.web.controller.user;

import com.dream.dto.user.UserInfoChangeDTO;
import com.dream.service.UserService;
import com.dream.util.SecurityUtil;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-17
 * Time: 上午11:15
 */
public class UserInfoChangeController extends SimpleFormController {
    private UserService userService;

    public UserInfoChangeController() {
        setCommandClass(UserInfoChangeDTO.class);
        setCommandName("userInfoChangeDTO");
        setFormView("user/userInfoChangeForm");
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        String currentUserGuid = SecurityUtil.currentUserGuid();
        return userService.loadUserInfoChangeDTObyUserGuid(currentUserGuid);
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        UserInfoChangeDTO userInfoChangeDTO = (UserInfoChangeDTO) command;
        userService.changeUserInfo(userInfoChangeDTO);
        return null;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
