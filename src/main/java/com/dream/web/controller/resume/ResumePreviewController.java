package com.dream.web.controller.resume;

import com.dream.dto.resume.ResumeDTO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.BaseCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 上午2:15
 */
public class ResumePreviewController extends BaseCommandController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ResumeDTO resumeDTO = new ResumeDTO();
        bindAndValidate(request, resumeDTO);
        return new ModelAndView("resume/resumePreview", "resume", resumeDTO);
    }
}
