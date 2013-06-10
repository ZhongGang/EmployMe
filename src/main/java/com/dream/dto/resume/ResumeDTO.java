package com.dream.dto.resume;

import com.dream.domain.resume.*;
import com.dream.domain.user.User;
import com.dream.util.SecurityUtil;
import com.dream.util.ValidateUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 下午8:44
 */
@Data
@NoArgsConstructor
public class ResumeDTO {
    private String guid;
    private BasicInfoDTO basicInfoDTO = new BasicInfoDTO();
    private List<EducationExperienceDTO> educationExperienceDTOs = new ArrayList<EducationExperienceDTO>();
    private List<WorkExperienceDTO> workExperienceDTOs = new ArrayList<WorkExperienceDTO>();
    private List<ProjectExperienceDTO> projectExperienceDTOs = new ArrayList<ProjectExperienceDTO>();

    public ResumeDTO(Resume resume) {
        this.guid = resume.guid();

        BasicInfo basicInfo = resume.basicInfo();
        this.basicInfoDTO = new BasicInfoDTO(basicInfo);

        List<EducationExperience> educationExperiences = resume.educationExperiences();
        for (EducationExperience educationExperience : educationExperiences) {
            EducationExperienceDTO educationExperienceDTO = new EducationExperienceDTO(educationExperience);
            educationExperienceDTOs.add(educationExperienceDTO);
        }

        List<WorkExperience> workExperiences = resume.workExperiences();
        for (WorkExperience workExperience : workExperiences) {
            WorkExperienceDTO workExperienceDTO = new WorkExperienceDTO(workExperience);
            workExperienceDTOs.add(workExperienceDTO);
        }

        List<ProjectExperience> projectExperiences = resume.projectExperiences();
        for (ProjectExperience projectExperience : projectExperiences) {
            ProjectExperienceDTO projectExperienceDTO = new ProjectExperienceDTO(projectExperience);
            projectExperienceDTOs.add(projectExperienceDTO);
        }
    }

    public boolean isCreate() {
        return ValidateUtil.isEmptyText(this.guid);
    }

    public boolean isHasEducationExperiences() {
        return !educationExperienceDTOs.isEmpty();
    }

    public boolean isHasWorkExperiences() {
        return !workExperienceDTOs.isEmpty();
    }

    public boolean isHasProjectExperiences() {
        return !projectExperienceDTOs.isEmpty();
    }

    public Resume toNewResume() {
        BasicInfo basicInfo = basicInfoDTO.toBasicInfo();

        List<EducationExperience> educationExperiences = new ArrayList<EducationExperience>();
        for (EducationExperienceDTO educationExperienceDTO : educationExperienceDTOs) {
            EducationExperience educationExperience = educationExperienceDTO.toEducationExperience();
            educationExperiences.add(educationExperience);
        }

        List<WorkExperience> workExperiences = new ArrayList<WorkExperience>();
        for (WorkExperienceDTO workExperienceDTO : workExperienceDTOs) {
            WorkExperience workExperience = workExperienceDTO.toWorkExperience();
            workExperiences.add(workExperience);
        }

        List<ProjectExperience> projectExperiences = new ArrayList<ProjectExperience>();
        for (ProjectExperienceDTO projectExperienceDTO : projectExperienceDTOs) {
            ProjectExperience projectExperience = projectExperienceDTO.toProjectExperience();
            projectExperiences.add(projectExperience);
        }
        User user = SecurityUtil.currentUser();
        return new Resume(basicInfo, educationExperiences, workExperiences, projectExperiences, user);
    }

    public void toUpdatedResume(Resume resume) {
        BasicInfo basicInfo = basicInfoDTO.toBasicInfo();

        List<EducationExperience> educationExperiences = new ArrayList<EducationExperience>();
        for (EducationExperienceDTO educationExperienceDTO : educationExperienceDTOs) {
            EducationExperience educationExperience = educationExperienceDTO.toEducationExperience();
            educationExperiences.add(educationExperience);
        }

        List<WorkExperience> workExperiences = new ArrayList<WorkExperience>();
        for (WorkExperienceDTO workExperienceDTO : workExperienceDTOs) {
            WorkExperience workExperience = workExperienceDTO.toWorkExperience();
            workExperiences.add(workExperience);
        }

        List<ProjectExperience> projectExperiences = new ArrayList<ProjectExperience>();
        for (ProjectExperienceDTO projectExperienceDTO : projectExperienceDTOs) {
            ProjectExperience projectExperience = projectExperienceDTO.toProjectExperience();
            projectExperiences.add(projectExperience);
        }

        resume.update(basicInfo, educationExperiences, workExperiences, projectExperiences);
    }
}
