package com.dream.domain.resume;

import com.dream.domain.DomainObject;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午10:16
 */
public class ProjectExperience extends DomainObject {
    private LocalDate startDate;
    private LocalDate endDate;
    private String project;
    private List<String> technologies = new ArrayList<String>();
    private String remark;
    private String duty;

    public ProjectExperience() {
    }

    public ProjectExperience(LocalDate startDate, LocalDate endDate, String project, List<String> technologies, String remark, String duty) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.project = project;
        this.technologies = technologies;
        this.remark = remark;
        this.duty = duty;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getProject() {
        return project;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public String getRemark() {
        return remark;
    }

    public String getDuty() {
        return duty;
    }

    public String getDisplayTechnologies() {
        StringBuilder result = new StringBuilder();
        for (String technology : technologies) {
            result.append(technology);
            result.append(", ");
        }
        return result.toString().substring(0, result.lastIndexOf(", "));
    }
}
