package com.dream.domain.attachment;

import com.dream.domain.DomainObject;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-8
 * Time: 下午11:36
 */
public abstract class Attachment extends DomainObject {
    private String name;
    private String type;

    protected Attachment() {
    }

    protected Attachment(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String name() {
        return name;
    }

    public String type() {
        return type;
    }
}
