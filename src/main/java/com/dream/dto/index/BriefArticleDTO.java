package com.dream.dto.index;

import com.dream.domain.article.Article;
import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-18
 * Time: 上午12:26
 */
@Getter
public class BriefArticleDTO {
    private String guid;
    private String title;
    private String category;

    public BriefArticleDTO(Article article) {
        this.guid = article.guid();
        this.title = article.title();
        this.category = article.category().getLabel();
    }
}
