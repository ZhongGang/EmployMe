package com.dream.web.controller.article;

import com.dream.domain.article.Category;
import com.dream.dto.article.ArticleDTO;
import com.dream.service.ArticleService;
import com.dream.util.ValidateUtil;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午7:45
 */
public class ArticleFormController extends SimpleFormController {
    private ArticleService articleService;

    public ArticleFormController() {
        setCommandClass(ArticleDTO.class);
        setCommandName("article");
        setFormView("article/articleForm");
    }

    @Override
    protected Map referenceData(HttpServletRequest request, Object command, Errors errors) throws Exception {
        Map model = new HashMap();
        model.put("categories", Category.values());
        return model;
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        String articleGuid = ServletRequestUtils.getStringParameter(request, "guid");
        if (ValidateUtil.isEmptyText(articleGuid)) {
            return new ArticleDTO();
        }
        return articleService.loadArticleByGuid(articleGuid);
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        ArticleDTO articleDTO = (ArticleDTO) command;
        articleService.saveOrUpdate(articleDTO);
        return new ModelAndView("redirect:/article/overview");
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }
}
