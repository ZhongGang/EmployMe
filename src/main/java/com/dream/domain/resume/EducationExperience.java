package com.dream.domain.resume;

import com.dream.domain.DomainObject;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午10:12
 */
@NoArgsConstructor
@AllArgsConstructor
public class EducationExperience extends DomainObject {
    private LocalDate startDate;
    private LocalDate endDate;
    private String school;
    private String major;
    private String description;

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
