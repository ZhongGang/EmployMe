package com.dream.dto.resume;

import com.dream.domain.resume.WorkExperience;
import com.dream.util.JodaTimeUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 下午8:50
 */
@Data
@NoArgsConstructor
public class WorkExperienceDTO {
    private String guid;
    private String startDate;
    private String endDate;
    private String company;
    private String position;
    private String department;
    private String description;

    public WorkExperienceDTO(WorkExperience workExperience) {
        this.guid = workExperience.guid();
        this.startDate = workExperience.getStartDate().toString();
        this.endDate = workExperience.getEndDate().toString();
        this.company = workExperience.getCompany();
        this.position = workExperience.getPosition();
        this.department = workExperience.getDepartment();
        this.description = workExperience.getDescription();
    }

    public WorkExperience toWorkExperience() {
        LocalDate startDate = JodaTimeUtil.parseLocalDate(this.startDate);
        LocalDate endDate = JodaTimeUtil.parseLocalDate(this.endDate);
        return new WorkExperience(startDate, endDate, company, position, department, description);
    }
}
