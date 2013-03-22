package com.dream.web.security;

import com.dream.domain.user.User;
import com.dream.util.ValidateUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-20
 * Time: 下午6:03
 */
public class SecurityAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    private String targetUrl4Administrator;
    private String targetUrl4Applicant;
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        User user = (User) authentication.getPrincipal();
        if (user.isAdministrator()) {
            redirectStrategy.sendRedirect(request, response, targetUrl4Administrator);
        } else {
            redirectStrategy.sendRedirect(request, response, targetUrl4Applicant);
        }
    }

    public void setTargetUrl4Administrator(String targetUrl4Administrator) {
        assert !ValidateUtil.isEmptyText(targetUrl4Administrator);
        this.targetUrl4Administrator = targetUrl4Administrator;
    }

    public void setTargetUrl4Applicant(String targetUrl4Applicant) {
        assert !ValidateUtil.isEmptyText(targetUrl4Applicant);
        this.targetUrl4Applicant = targetUrl4Applicant;
    }
}
