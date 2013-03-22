package com.dream.service;

import com.dream.dto.attachment.PortraitDTO;
import com.dream.dto.resume.ResumeDTO;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 上午2:15
 */
public interface ResumeService {

    ResumeDTO loadResumeByGuid(String resumeGuid);

    void saveOrUpdateResume(ResumeDTO resumeDTO);

    ResumeDTO loadMyResume(String currentUserGuid);

    PortraitDTO loadPortraitByResumeGuid(String resumeGuid);
}
