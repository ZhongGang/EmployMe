package com.dream.web.controller.article;

import com.dream.dto.article.ArticleViewDTO;
import com.dream.service.ArticleService;
import com.dream.util.SecurityUtil;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 上午12:35
 */
public class ArticlesOverviewController extends AbstractController {
    private ArticleService articleService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String currentUserGuid = SecurityUtil.currentUserGuid();
        List<ArticleViewDTO> articleDTOs = articleService.loadCurrentUserArticles(currentUserGuid);
        return new ModelAndView("article/articleOverview", "articleDTOs", articleDTOs);
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }
}
