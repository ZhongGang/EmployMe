package com.dream.service.impl;

import com.dream.dao.ResumeDao;
import com.dream.domain.attachment.Portrait;
import com.dream.domain.resume.Resume;
import com.dream.dto.attachment.PortraitDTO;
import com.dream.dto.resume.ResumeDTO;
import com.dream.service.ResumeService;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 上午2:15
 */
public class ResumeServiceImpl implements ResumeService {
    private ResumeDao resumeDao;

    @Override
    public ResumeDTO loadResumeByGuid(String resumeGuid) {
        Resume resume = resumeDao.findByGuid(Resume.class, resumeGuid);
        return new ResumeDTO(resume);
    }

    @Override
    public void saveOrUpdateResume(ResumeDTO resumeDTO) {
        if (resumeDTO.isCreate()) {
            Resume resume = resumeDTO.toNewResume();
            resumeDao.saveOrUpdate(resume);
        } else {
            Resume resume = resumeDao.findByGuid(Resume.class, resumeDTO.getGuid());
            resumeDTO.toUpdatedResume(resume);
        }
    }

    @Override
    public ResumeDTO loadMyResume(String currentUserGuid) {
        Resume resume = resumeDao.findMyResume(currentUserGuid);
        if (resume == null) {
            return new ResumeDTO();
        }
        return new ResumeDTO(resume);
    }

    @Override
    public PortraitDTO loadPortraitByResumeGuid(String resumeGuid) {
        Resume resume = resumeDao.findByGuid(Resume.class, resumeGuid);
        Portrait portrait = resume.basicInfo().portrait();
        if (portrait == null) {
            return null;
        }
        return new PortraitDTO(portrait);
    }

    public void setResumeDao(ResumeDao resumeDao) {
        this.resumeDao = resumeDao;
    }
}
