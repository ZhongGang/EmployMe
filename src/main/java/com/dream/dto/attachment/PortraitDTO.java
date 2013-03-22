package com.dream.dto.attachment;

import com.dream.domain.attachment.Portrait;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-11
 * Time: 上午12:43
 */
public class PortraitDTO {
    private String name;
    private String type;
    private byte[] contents;

    public PortraitDTO(Portrait portrait) {
        this.name = portrait.name();
        this.type = portrait.type();
        this.contents = portrait.contents();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public byte[] getContents() {
        return contents;
    }
}
