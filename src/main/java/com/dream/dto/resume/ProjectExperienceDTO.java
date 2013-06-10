package com.dream.dto.resume;

import com.dream.domain.resume.ProjectExperience;
import com.dream.util.JodaTimeUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 下午8:52
 */
@Data
@NoArgsConstructor
public class ProjectExperienceDTO {
    private String guid;
    private String startDate;
    private String endDate;
    private String project;
    private String technologies;
    private String remark;
    private String duty;

    public ProjectExperienceDTO(ProjectExperience projectExperience) {
        this.guid = projectExperience.guid();
        this.startDate = projectExperience.getStartDate().toString();
        this.endDate = projectExperience.getEndDate().toString();
        this.project = projectExperience.getProject();
        this.technologies = projectExperience.getDisplayTechnologies();
        this.remark = projectExperience.getRemark();
        this.duty = projectExperience.getDuty();
    }

    public ProjectExperience toProjectExperience() {
        LocalDate startDate = JodaTimeUtil.parseLocalDate(this.startDate);
        LocalDate endDate = JodaTimeUtil.parseLocalDate(this.endDate);
        String[] technologies = this.technologies.split(",");
        return new ProjectExperience(startDate, endDate, project, Arrays.asList(technologies), remark, duty);
    }
}
