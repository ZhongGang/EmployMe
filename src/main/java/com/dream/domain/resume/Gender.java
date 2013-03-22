package com.dream.domain.resume;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午10:03
 */
public enum Gender {
    MALE("男"),
    FEMALE("女");

    private String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return this.name();
    }
}
