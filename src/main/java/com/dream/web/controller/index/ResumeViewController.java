package com.dream.web.controller.index;

import com.dream.dto.resume.ResumeDTO;
import com.dream.service.ResumeService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-18
 * Time: 上午1:14
 */
public class ResumeViewController extends AbstractController {
    private ResumeService resumeService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String resumeGuid = ServletRequestUtils.getRequiredStringParameter(request, "resumeGuid");
        ResumeDTO resumeDTO = resumeService.loadResumeByGuid(resumeGuid);
        return new ModelAndView("resume/resumePreview", "resume", resumeDTO);
    }

    public void setResumeService(ResumeService resumeService) {
        this.resumeService = resumeService;
    }
}
