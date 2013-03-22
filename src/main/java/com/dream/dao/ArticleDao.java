package com.dream.dao;

import com.dream.domain.article.Article;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午8:00
 */
public interface ArticleDao extends DomainObjectDao{

    List<Article> findCurrentUserArticles(String currentUserGuid);
}
