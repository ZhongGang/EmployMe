package com.dream.domain.resume;

import com.dream.domain.DomainObject;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午10:12
 */
public class EducationExperience extends DomainObject {
    private LocalDate startDate;
    private LocalDate endDate;
    private String school;
    private String major;
    private String description;

    public EducationExperience() {
    }

    public EducationExperience(LocalDate startDate, LocalDate endDate, String school, String major, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.school = school;
        this.major = major;
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getSchool() {
        return school;
    }

    public String getMajor() {
        return major;
    }

    public String getDescription() {
        return description;
    }
}
