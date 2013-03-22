package com.dream.dao;

import com.dream.domain.DomainObject;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午7:49
 */
public interface DomainObjectDao {

    <T extends DomainObject> void saveOrUpdate(T t);

    <T extends DomainObject> T findByGuid(Class<T> clazz, String guid);

    <T extends DomainObject> List<T> findAll(Class<T> clazz);

    void deactiveByGuid(Class<? extends DomainObject> clazz, String guid);

    void activeByGuid(Class<? extends DomainObject> clazz, String guid);
}
