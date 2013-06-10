package com.dream.dto.resume;

import com.dream.domain.resume.EducationExperience;
import com.dream.util.JodaTimeUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 下午8:49
 */
@Data
@NoArgsConstructor
public class EducationExperienceDTO {
    private String guid;
    private String startDate;
    private String endDate;
    private String school;
    private String major;
    private String description;

    public EducationExperienceDTO(EducationExperience educationExperience) {
        this.guid = educationExperience.guid();
        this.startDate = educationExperience.getStartDate().toString();
        this.endDate = educationExperience.getEndDate().toString();
        this.school = educationExperience.getSchool();
        this.major = educationExperience.getMajor();
        this.description = educationExperience.getDescription();
    }

    public EducationExperience toEducationExperience() {
        LocalDate startDate = JodaTimeUtil.parseLocalDate(this.startDate);
        LocalDate endDate = JodaTimeUtil.parseLocalDate(this.endDate);
        return new EducationExperience(startDate, endDate, this.school, this.major, this.description);
    }
}
