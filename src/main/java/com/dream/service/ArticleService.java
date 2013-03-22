package com.dream.service;

import com.dream.domain.article.Article;
import com.dream.dto.article.ArticleDTO;
import com.dream.dto.article.ArticleViewDTO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午8:01
 */
public interface ArticleService {

    ArticleDTO loadArticleByGuid(String guid);

    List<ArticleViewDTO> loadCurrentUserArticles(String currentUserGuid);

    void saveOrUpdate(ArticleDTO articleDTO);
}
