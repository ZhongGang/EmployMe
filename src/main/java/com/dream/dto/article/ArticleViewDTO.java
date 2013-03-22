package com.dream.dto.article;

import com.dream.domain.article.Article;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 上午1:51
 */
public class ArticleViewDTO {
    private String guid;
    private String title;
    private String content;
    private String category;
    private boolean active;

    public ArticleViewDTO() {
    }

    public ArticleViewDTO(Article article) {
        this.guid = article.guid();
        this.title = article.title();
        this.content = article.content();
        this.category = article.category().getLabel();
        this.active = article.active();
    }

    public String getGuid() {
        return guid;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public boolean isActive() {
        return active;
    }
}
