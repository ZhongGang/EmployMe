package com.dream.domain.article;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-20
 * Time: 下午5:50
 */
public class ArticleTest {

    @Test
    public void testPublicConstructor() throws Exception {
        Class clazz = Class.forName("com.dream.domain.article.Article");
        Article article = (Article) clazz.newInstance();
        Assert.assertNotNull(article);
    }

    @Test
    public void testProtectedConstructor() throws Exception {
        Class clazz = Class.forName("com.dream.domain.article.Article");
        Article article = (Article) clazz.newInstance();
        Assert.assertNotNull(article);
    }
}
