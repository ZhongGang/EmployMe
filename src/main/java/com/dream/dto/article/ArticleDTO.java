package com.dream.dto.article;

import com.dream.domain.article.Article;
import com.dream.domain.article.Category;
import com.dream.domain.user.User;
import com.dream.util.SecurityUtil;
import com.dream.util.ValidateUtil;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午7:45
 */
public class ArticleDTO {
    private String guid;
    private String title;
    private String content;
    private Category category;

    public ArticleDTO() {
    }

    public ArticleDTO(Article article) {
        this.guid = article.guid();
        this.title = article.title();
        this.content = article.content();
        this.category = article.category();
    }

    public boolean isNew() {
        return ValidateUtil.isEmptyText(this.guid);
    }

    public Article toNewArticle() {
        User user = SecurityUtil.currentUser();
        return new Article(this.title, this.content, this.category, user);
    }

    public Article toUpdateArticle(Article article) {
        article.update(this.title, this.content, this.category);
        return article;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
