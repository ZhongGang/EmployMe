package com.dream.domain.resume;

import com.dream.domain.DomainObject;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午10:13
 */
public class WorkExperience extends DomainObject {
    private LocalDate startDate;
    private LocalDate endDate;
    private String company;
    private String position;
    private String department;
    private String description;

    public WorkExperience() {
    }

    public WorkExperience(LocalDate startDate, LocalDate endDate, String company, String position, String department, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.company = company;
        this.position = position;
        this.department = department;
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getDescription() {
        return description;
    }
}
