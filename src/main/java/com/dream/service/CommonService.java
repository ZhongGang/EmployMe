package com.dream.service;

import com.dream.domain.DomainObject;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午5:54
 */
public interface CommonService {

    <T extends DomainObject> void deactiveByGuid(Class<T> clazz, String guid);

    <T extends DomainObject> void activeByGuid(Class<T> clazz, String guid);
}
