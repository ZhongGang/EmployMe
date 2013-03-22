package com.dream.web.controller.resume;

import com.dream.dto.attachment.PortraitDTO;
import com.dream.service.ResumeService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-11
 * Time: 上午12:27
 */
public class PortraitShowController extends AbstractController {
    private ResumeService resumeService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String resumeGuid = ServletRequestUtils.getRequiredStringParameter(request, "resumeGuid");
        PortraitDTO portraitDTO = resumeService.loadPortraitByResumeGuid(resumeGuid);
        response.addHeader("Content-Type", portraitDTO.getType());
        response.addHeader("Content-disposition", "filename=" + portraitDTO.getName());
        ServletOutputStream out = response.getOutputStream();
        out.write(portraitDTO.getContents());
        return null;
    }

    public void setResumeService(ResumeService resumeService) {
        this.resumeService = resumeService;
    }
}
