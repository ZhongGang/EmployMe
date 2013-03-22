package com.dream.service.impl;

import com.dream.dao.CommonDao;
import com.dream.domain.DomainObject;
import com.dream.service.CommonService;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午5:54
 */
public class CommonServiceImpl implements CommonService {
    private CommonDao commonDao;

    @Override
    public <T extends DomainObject> void deactiveByGuid(Class<T> clazz, String guid) {
        commonDao.deactiveByGuid(clazz, guid);
    }

    @Override
    public <T extends DomainObject> void activeByGuid(Class<T> clazz, String guid) {
        commonDao.activeByGuid(clazz, guid);
    }

    public void setCommonDao(CommonDao commonDao) {
        this.commonDao = commonDao;
    }
}
