package com.dream.web.controller.resume;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-8
 * Time: 上午12:44
 */
public class ProjectExperienceItemGenerateController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int index = ServletRequestUtils.getRequiredIntParameter(request, "index");
        return new ModelAndView("resume/projectExperienceItem", "index", index);
    }
}
