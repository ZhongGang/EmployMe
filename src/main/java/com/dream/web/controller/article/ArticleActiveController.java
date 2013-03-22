package com.dream.web.controller.article;

import com.dream.dao.CommonDao;
import com.dream.domain.article.Article;
import com.dream.service.CommonService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午4:19
 */
public class ArticleActiveController extends AbstractController {
    private CommonService commonService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String articleGuid = ServletRequestUtils.getRequiredStringParameter(request, "guid");
        commonService.activeByGuid(Article.class, articleGuid);
        return new ModelAndView("redirect:/article/overview");
    }

    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }
}
