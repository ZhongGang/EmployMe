package com.dream.dao.impl;

import com.dream.dao.DomainObjectDao;
import com.dream.domain.DomainObject;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午7:49
 */
public abstract class DomainObjectDaoImpl implements DomainObjectDao {
    protected SessionFactory sessionFactory;

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public <T extends DomainObject> void saveOrUpdate(T t) {
        currentSession().saveOrUpdate(t);
    }

    @Override
    public <T extends DomainObject> T findByGuid(final Class<T> clazz, final String guid) {
        Query query = currentSession().createQuery("from " + clazz.getName() + " t where t.guid=:guid");
        query.setParameter("guid", guid);
        return (T) query.uniqueResult();
    }

    @Override
    public <T extends DomainObject> List<T> findAll(Class<T> clazz) {
        Query query = currentSession().createQuery("from " + clazz.getName());
        return query.list();
    }

    @Override
    public void deactiveByGuid(Class<? extends DomainObject> clazz, String guid) {
        Query query = currentSession().createQuery("update " + clazz.getName() + " t set t.active=false where t.guid=:guid");
        query.setParameter("guid", guid);
        query.executeUpdate();
    }

    @Override
    public void activeByGuid(Class<? extends DomainObject> clazz, String guid) {
        Query query = currentSession().createQuery("update " + clazz.getName() + " t set t.active=true where t.guid=:guid");
        query.setParameter("guid", guid);
        query.executeUpdate();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
