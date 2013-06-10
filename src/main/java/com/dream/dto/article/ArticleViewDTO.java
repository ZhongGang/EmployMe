package com.dream.dto.article;

import com.dream.domain.article.Article;
import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 上午1:51
 */
public class ArticleViewDTO {
    @Getter
    private String guid;
    @Getter
    private String title;
    @Getter
    private String content;
    @Getter
    private String category;
    @Getter
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

}
