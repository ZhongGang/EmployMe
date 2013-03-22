package com.dream.domain.attachment;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-10
 * Time: 下午8:33
 */
public class Portrait extends BlobAttachment {

    public Portrait() {
    }

    public Portrait(String name, String type, byte[] contents) {
        super(name, type, contents);
    }
}
