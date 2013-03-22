package com.dream.dao.impl;

import com.dream.dao.UserDao;
import com.dream.domain.user.User;
import org.hibernate.Query;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午1:30
 */
public class UserDaoImpl extends DomainObjectDaoImpl implements UserDao {

    @Override
    public User findUserByUsername(String username) {
        Query query = currentSession().createQuery("from User u where u.active=true and u.username=:username");
        query.setParameter("username", username);
        return (User) query.uniqueResult();
    }

    @Override
    public int findEmailCount(String email) {
        Query query = currentSession().createQuery("select count(*) from User u where u.email=:email");
        query.setParameter("email", email);
        return ((Long) query.uniqueResult()).intValue();
    }

    @Override
    public int findUsernameCount(String username) {
        Query query = currentSession().createQuery("select count(*) from User u where u.username=:username");
        query.setParameter("username", username);
        return ((Long) query.uniqueResult()).intValue();
    }
}
