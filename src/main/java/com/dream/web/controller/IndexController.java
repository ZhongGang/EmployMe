package com.dream.web.controller;

import com.dream.dto.index.BriefUserDTO;
import com.dream.service.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午9:09
 */
public class IndexController extends AbstractController {
    private UserService userService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<BriefUserDTO> briefUserDTOs = userService.loadBriefUserDTOs();
        return new ModelAndView("index", "briefUserDTOs", briefUserDTOs);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
