package com.dream.domain.resume;

import com.dream.domain.DomainObject;
import com.dream.domain.user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午9:53
 */
public class Resume extends DomainObject {
    private BasicInfo basicInfo = new BasicInfo();
    private List<EducationExperience> educationExperiences = new ArrayList<EducationExperience>();
    private List<WorkExperience> workExperiences = new ArrayList<WorkExperience>();
    private List<ProjectExperience> projectExperiences = new ArrayList<ProjectExperience>();
    private User user;

    public Resume() {
    }

    public Resume(BasicInfo basicInfo, List<EducationExperience> educationExperiences, List<WorkExperience> workExperiences, List<ProjectExperience> projectExperiences, User user) {
        this.basicInfo = basicInfo;
        this.educationExperiences = educationExperiences;
        this.workExperiences = workExperiences;
        this.projectExperiences = projectExperiences;
        this.user = user;
    }

    public BasicInfo basicInfo() {
        return basicInfo;
    }

    public List<EducationExperience> educationExperiences() {
        return educationExperiences;
    }

    public List<WorkExperience> workExperiences() {
        return workExperiences;
    }

    public List<ProjectExperience> projectExperiences() {
        return projectExperiences;
    }

    public void update(BasicInfo basicInfo, List<EducationExperience> educationExperiences, List<WorkExperience> workExperiences, List<ProjectExperience> projectExperiences) {
        this.basicInfo = basicInfo;
        this.educationExperiences = educationExperiences;
        this.workExperiences = workExperiences;
        this.projectExperiences = projectExperiences;
    }
}
