package com.dream.domain.resume;

import com.dream.domain.DomainObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午10:13
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class WorkExperience extends DomainObject {
    private LocalDate startDate;
    private LocalDate endDate;
    private String company;
    private String position;
    private String department;
    private String description;
}
