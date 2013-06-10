package com.dream.dto.index;

import com.dream.domain.resume.BasicInfo;
import com.dream.domain.resume.Resume;
import com.dream.util.JodaTimeUtil;
import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-18
 * Time: 上午12:29
 */
@Getter
public class BriefResumeDTO {
    private String guid;
    private String name;
    private String gender;
    private String birthday;

    public BriefResumeDTO(Resume resume) {
        this.guid = resume.guid();
        BasicInfo basicInfo = resume.basicInfo();
        this.name = basicInfo.name().chineseName();
        this.gender = basicInfo.gender().getLabel();
        this.birthday = JodaTimeUtil.getLocalDateAsString(basicInfo.birthday());
    }
}
