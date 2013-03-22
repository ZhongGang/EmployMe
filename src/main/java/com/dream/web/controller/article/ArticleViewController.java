package com.dream.web.controller.article;

import com.dream.dto.article.ArticleDTO;
import com.dream.service.ArticleService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午3:58
 */
public class ArticleViewController extends AbstractController {
    private ArticleService articleService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String articleGuid = ServletRequestUtils.getRequiredStringParameter(request, "guid");
        ArticleDTO articleDTO = articleService.loadArticleByGuid(articleGuid);
        return new ModelAndView("article/articleView", "articleDTO", articleDTO);
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }
}
