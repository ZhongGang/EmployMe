package com.dream.dto.resume;

import com.dream.domain.resume.EducationExperience;
import com.dream.util.JodaTimeUtil;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 下午8:49
 */
public class EducationExperienceDTO {
    private String guid;
    private String startDate;
    private String endDate;
    private String school;
    private String major;
    private String description;

    public EducationExperienceDTO() {
    }

    public EducationExperienceDTO(EducationExperience educationExperience) {
        this.guid = educationExperience.guid();
        this.startDate = educationExperience.getStartDate().toString();
        this.endDate = educationExperience.getEndDate().toString();
        this.school = educationExperience.getSchool();
        this.major = educationExperience.getMajor();
        this.description = educationExperience.getDescription();
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EducationExperience toEducationExperience() {
        LocalDate startDate = JodaTimeUtil.parseLocalDate(this.startDate);
        LocalDate endDate = JodaTimeUtil.parseLocalDate(this.endDate);
        return new EducationExperience(startDate, endDate, this.school, this.major, this.description);
    }
}
