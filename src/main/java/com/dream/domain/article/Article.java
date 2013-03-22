package com.dream.domain.article;

import com.dream.domain.DomainObject;
import com.dream.domain.user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午6:26
 */
public class Article extends DomainObject {
    private String title;
    private String content;
    private Category category;
    private List<Comment> comments = new ArrayList<Comment>();
    private User user;

    public Article() {
    }

    public Article(String title, String content, Category category,User user) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.user = user;
    }

    public String title() {
        return this.title;
    }

    public String content() {
        return this.content;
    }

    public Category category() {
        return this.category;
    }

    public void update(String title, String content, Category category) {
        this.title = title;
        this.content = content;
        this.category = category;
    }
}
