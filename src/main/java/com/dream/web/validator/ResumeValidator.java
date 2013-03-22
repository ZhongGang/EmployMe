package com.dream.web.validator;

import com.dream.dto.resume.*;
import com.dream.util.ValidateUtil;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-8
 * Time: 下午5:12
 */
public class ResumeValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ResumeDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ResumeDTO resumeDTO = (ResumeDTO) target;
        BasicInfoDTO basicInfoDTO = resumeDTO.getBasicInfoDTO();

        String chineseName = basicInfoDTO.getChineseName();
        if (ValidateUtil.isEmptyText(chineseName)) {
            errors.rejectValue("basicInfoDTO.chineseName", null, "Text should not be empty!");
        }

        String englishName = basicInfoDTO.getEnglishName();
        if (ValidateUtil.isEmptyText(englishName)) {
            errors.rejectValue("basicInfoDTO.englishName", null, "Text should not be empty!");
        }

        String address = basicInfoDTO.getAddress();
        if (ValidateUtil.isEmptyText(address)) {
            errors.rejectValue("basicInfoDTO.address", null, "Text should not be empty!");
        }

        String birthday = basicInfoDTO.getBirthday();
        if (ValidateUtil.isEmptyText(birthday)) {
            errors.rejectValue("basicInfoDTO.birthday", null, "Text should not be empty!");
        }

        String phone = basicInfoDTO.getPhone();
        if (ValidateUtil.isEmptyText(phone)) {
            errors.rejectValue("basicInfoDTO.phone", null, "Text should not be empty!");
        }

        String email = basicInfoDTO.getEmail();
        if (ValidateUtil.isEmptyText(email)) {
            errors.rejectValue("basicInfoDTO.email", null, "Text should not be empty!");
        }

        String qq = basicInfoDTO.getQq();
        if (ValidateUtil.isEmptyText(qq)) {
            errors.rejectValue("basicInfoDTO.qq", null, "Text should not be empty!");
        }

        String selfDescription = basicInfoDTO.getSelfDescription();
        if (ValidateUtil.isEmptyText(selfDescription)) {
            errors.rejectValue("basicInfoDTO.selfDescription", null, "Text should not be empty!");
        }

        List<EducationExperienceDTO> educationExperienceDTOs = resumeDTO.getEducationExperienceDTOs();
        for (int i = 0; i < educationExperienceDTOs.size(); i++) {
            EducationExperienceDTO educationExperienceDTO = educationExperienceDTOs.get(i);
            String startDate = educationExperienceDTO.getStartDate();
            if (ValidateUtil.isEmptyText(startDate)) {
                errors.rejectValue("educationExperienceDTOs[" + i + "].startDate", null, "Text should not be empty!");
            }
            String endDate = educationExperienceDTO.getEndDate();
            if (ValidateUtil.isEmptyText(endDate)) {
                errors.rejectValue("educationExperienceDTOs[" + i + "].endDate", null, "Text should not be empty!");
            }
            String major = educationExperienceDTO.getMajor();
            if (ValidateUtil.isEmptyText(major)) {
                errors.rejectValue("educationExperienceDTOs[" + i + "].major", null, "Text should not be empty!");
            }
            String school = educationExperienceDTO.getSchool();
            if (ValidateUtil.isEmptyText(school)) {
                errors.rejectValue("educationExperienceDTOs[" + i + "].school", null, "Text should not be empty!");
            }
            String description = educationExperienceDTO.getDescription();
            if (ValidateUtil.isEmptyText(description)) {
                errors.rejectValue("educationExperienceDTOs[" + i + "].description", null, "Text should not be empty!");
            }
        }

        List<WorkExperienceDTO> workExperienceDTOs = resumeDTO.getWorkExperienceDTOs();
        for (int i = 0; i < workExperienceDTOs.size(); i++) {
            WorkExperienceDTO workExperienceDTO = workExperienceDTOs.get(i);
            String startDate = workExperienceDTO.getStartDate();
            if (ValidateUtil.isEmptyText(startDate)) {
                errors.rejectValue("workExperienceDTOs[" + i + "].startDate", null, "Text should not be empty!");
            }
            String endDate = workExperienceDTO.getEndDate();
            if (ValidateUtil.isEmptyText(endDate)) {
                errors.rejectValue("workExperienceDTOs[" + i + "].endDate", null, "Text should not be empty!");
            }
            String company = workExperienceDTO.getCompany();
            if (ValidateUtil.isEmptyText(company)) {
                errors.rejectValue("workExperienceDTOs[" + i + "].company", null, "Text should not be empty!");
            }
            String department = workExperienceDTO.getDepartment();
            if (ValidateUtil.isEmptyText(department)) {
                errors.rejectValue("workExperienceDTOs[" + i + "].department", null, "Text should not be empty!");
            }
            String position = workExperienceDTO.getPosition();
            if (ValidateUtil.isEmptyText(position)) {
                errors.rejectValue("workExperienceDTOs[" + i + "].position", null, "Text should not be empty!");
            }
            String description = workExperienceDTO.getDescription();
            if (ValidateUtil.isEmptyText(description)) {
                errors.rejectValue("workExperienceDTOs[" + i + "].description", null, "Text should not be empty!");
            }
        }

        List<ProjectExperienceDTO> projectExperienceDTOs = resumeDTO.getProjectExperienceDTOs();
        for (int i = 0; i < projectExperienceDTOs.size(); i++) {
            ProjectExperienceDTO projectExperienceDTO = projectExperienceDTOs.get(i);
            String startDate = projectExperienceDTO.getStartDate();
            if (ValidateUtil.isEmptyText(startDate)) {
                errors.rejectValue("projectExperienceDTOs[" + i + "].startDate", null, "Text should not be empty!");
            }
            String endDate = projectExperienceDTO.getEndDate();
            if (ValidateUtil.isEmptyText(endDate)) {
                errors.rejectValue("projectExperienceDTOs[" + i + "].endDate", null, "Text should not be empty!");
            }
            String project = projectExperienceDTO.getProject();
            if (ValidateUtil.isEmptyText(project)) {
                errors.rejectValue("projectExperienceDTOs[" + i + "].project", null, "Text should not be empty!");
            }
            String duty = projectExperienceDTO.getDuty();
            if (ValidateUtil.isEmptyText(duty)) {
                errors.rejectValue("projectExperienceDTOs[" + i + "].duty", null, "Text should not be empty!");
            }
            String remark = projectExperienceDTO.getRemark();
            if (ValidateUtil.isEmptyText(remark)) {
                errors.rejectValue("projectExperienceDTOs[" + i + "].remark", null, "Text should not be empty!");
            }
            String technologies = projectExperienceDTO.getTechnologies();
            if (ValidateUtil.isEmptyText(technologies)) {
                errors.rejectValue("projectExperienceDTOs[" + i + "].technologies", null, "Text should not be empty!");
            }
        }
    }
}
