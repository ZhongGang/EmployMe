package com.dream.domain;

import com.dream.util.GuidGenerator;
import com.dream.util.JodaTimeUtil;
import org.joda.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午6:20
 */
public abstract class DomainObject {
    private Integer id;
    private Integer version = Integer.valueOf(0);
    private Boolean active = Boolean.TRUE;
    private String guid = GuidGenerator.generate();
    private LocalDateTime createTime = JodaTimeUtil.now();

    public String guid() {
        return this.guid;
    }

    public Boolean active() {
        return this.active;
    }

}
