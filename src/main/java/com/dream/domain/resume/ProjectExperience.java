package com.dream.domain.resume;

import com.dream.domain.DomainObject;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午10:16
 */
@NoArgsConstructor
@AllArgsConstructor
public class ProjectExperience extends DomainObject {
    private LocalDate startDate;
    private LocalDate endDate;
    private String project;
    private List<String> technologies = new ArrayList<String>();
    private String remark;
    private String duty;

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
