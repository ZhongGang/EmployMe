package com.dream.dao.impl;

import com.dream.dao.ResumeDao;
import com.dream.domain.resume.Resume;
import org.hibernate.Query;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 上午2:16
 */
public class ResumeDaoImpl extends DomainObjectDaoImpl implements ResumeDao {

    @Override
    public Resume findMyResume(String currentUserGuid) {
        Query query = currentSession().createQuery("from Resume r where r.user.guid=:userGuid");
        query.setParameter("userGuid", currentUserGuid);
        return (Resume) query.uniqueResult();
    }
}
