package com.dream.dto.resume;

import com.dream.domain.resume.WorkExperience;
import com.dream.util.JodaTimeUtil;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 下午8:50
 */
public class WorkExperienceDTO {
    private String guid;
    private String startDate;
    private String endDate;
    private String company;
    private String position;
    private String department;
    private String description;

    public WorkExperienceDTO() {
    }

    public WorkExperienceDTO(WorkExperience workExperience) {
        this.guid = workExperience.guid();
        this.startDate = workExperience.getStartDate().toString();
        this.endDate = workExperience.getEndDate().toString();
        this.company = workExperience.getCompany();
        this.position = workExperience.getPosition();
        this.department = workExperience.getDepartment();
        this.description = workExperience.getDescription();
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkExperience toWorkExperience() {
        LocalDate startDate = JodaTimeUtil.parseLocalDate(this.startDate);
        LocalDate endDate = JodaTimeUtil.parseLocalDate(this.endDate);
        return new WorkExperience(startDate, endDate, company, position, department, description);
    }
}
