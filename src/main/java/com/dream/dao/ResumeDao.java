package com.dream.dao;

import com.dream.domain.resume.Resume;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 上午2:16
 */
public interface ResumeDao extends DomainObjectDao {

    Resume findMyResume(String currentUserGuid);
}
