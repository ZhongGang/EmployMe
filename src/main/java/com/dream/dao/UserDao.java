package com.dream.dao;

import com.dream.domain.user.User;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午1:30
 */
public interface UserDao extends DomainObjectDao {

    User findUserByUsername(String username);

    int findEmailCount(String email);

    int findUsernameCount(String username);
}
