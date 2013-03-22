package com.dream.web.controller.resume;

import com.dream.domain.resume.Gender;
import com.dream.dto.resume.ResumeDTO;
import com.dream.service.ResumeService;
import com.dream.util.SecurityUtil;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 上午4:37
 */
public class ResumeFormController extends SimpleFormController {
    private ResumeService resumeService;

    public ResumeFormController() {
        setCommandClass(ResumeDTO.class);
        setCommandName("resume");
        setFormView("resume/resumeForm");
    }

    @Override
    protected Map referenceData(HttpServletRequest request, Object command, Errors errors) throws Exception {
        Map model = new HashMap();
        model.put("genders", Gender.values());
        return model;
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        String currentUserGuid = SecurityUtil.currentUserGuid();
        return resumeService.loadMyResume(currentUserGuid);
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        ResumeDTO resumeDTO = (ResumeDTO) command;
        resumeService.saveOrUpdateResume(resumeDTO);
        return new ModelAndView("resume/resumePreview", "resume", resumeDTO);
    }

    public void setResumeService(ResumeService resumeService) {
        this.resumeService = resumeService;
    }
}
