package com.dream.dao.impl;

import com.dream.dao.ArticleDao;
import com.dream.domain.article.Article;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午8:01
 */
public class ArticleDaoImpl extends DomainObjectDaoImpl implements ArticleDao {

    @Override
    public List<Article> findCurrentUserArticles(String currentUserGuid) {
        Query query = currentSession().createQuery("from Article a where a.user.guid=:userGuid order by a.createTime");
        query.setParameter("userGuid", currentUserGuid);
        return query.list();
    }
}
