package com.dream.dto.resume;

import com.dream.domain.resume.ProjectExperience;
import com.dream.util.JodaTimeUtil;
import org.joda.time.LocalDate;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 下午8:52
 */
public class ProjectExperienceDTO {
    private String guid;
    private String startDate;
    private String endDate;
    private String project;
    private String technologies;
    private String remark;
    private String duty;

    public ProjectExperienceDTO() {
    }

    public ProjectExperienceDTO(ProjectExperience projectExperience) {
        this.guid = projectExperience.guid();
        this.startDate = projectExperience.getStartDate().toString();
        this.endDate = projectExperience.getEndDate().toString();
        this.project = projectExperience.getProject();
        this.technologies = projectExperience.getDisplayTechnologies();
        this.remark = projectExperience.getRemark();
        this.duty = projectExperience.getDuty();
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

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public ProjectExperience toProjectExperience() {
        LocalDate startDate = JodaTimeUtil.parseLocalDate(this.startDate);
        LocalDate endDate = JodaTimeUtil.parseLocalDate(this.endDate);
        String[] technologies = this.technologies.split(",");
        return new ProjectExperience(startDate, endDate, project, Arrays.asList(technologies), remark, duty);
    }
}
