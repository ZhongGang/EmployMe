package com.dream.domain.attachment;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-10
 * Time: 下午8:33
 */
public abstract class BlobAttachment extends Attachment {
    private byte[] contents;

    protected BlobAttachment() {
    }

    protected BlobAttachment(String name, String type, byte[] contents) {
        super(name, type);
        this.contents = contents;
    }

    public byte[] contents() {
        return contents;
    }
}
