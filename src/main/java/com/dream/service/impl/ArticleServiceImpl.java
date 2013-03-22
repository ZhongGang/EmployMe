package com.dream.service.impl;

import com.dream.dao.ArticleDao;
import com.dream.domain.article.Article;
import com.dream.dto.article.ArticleDTO;
import com.dream.dto.article.ArticleViewDTO;
import com.dream.service.ArticleService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午8:01
 */
public class ArticleServiceImpl implements ArticleService {
    private ArticleDao articleDao;

    @Override
    public ArticleDTO loadArticleByGuid(String guid) {
        Article article = articleDao.findByGuid(Article.class, guid);
        return new ArticleDTO(article);
    }

    @Override
    public List<ArticleViewDTO> loadCurrentUserArticles(String currentUserGuid) {
        List<Article> articles = articleDao.findCurrentUserArticles(currentUserGuid);
        List<ArticleViewDTO> articleDTOs = new ArrayList<ArticleViewDTO>();
        for (Article article : articles) {
            ArticleViewDTO articleDTO = new ArticleViewDTO(article);
            articleDTOs.add(articleDTO);
        }
        return articleDTOs;
    }

    @Override
    public void saveOrUpdate(ArticleDTO articleDTO) {
        if (articleDTO.isNew()) {
            Article article = articleDTO.toNewArticle();
            articleDao.saveOrUpdate(article);
        } else {
            Article article = articleDao.findByGuid(Article.class, articleDTO.getGuid());
            article = articleDTO.toUpdateArticle(article);
            articleDao.saveOrUpdate(article);
        }
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
}
