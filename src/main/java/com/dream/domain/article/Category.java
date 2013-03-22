package com.dream.domain.article;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午6:31
 */
public enum Category {
    SPRING("Spring"),
    HIBERNATE("Hibernate"),
    MAVEN("Maven");

    private String label;

    Category(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public String getValue() {
        return this.name();
    }
}
