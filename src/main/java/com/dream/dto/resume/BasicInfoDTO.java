package com.dream.dto.resume;

import com.dream.domain.resume.BasicInfo;
import com.dream.domain.resume.Gender;
import com.dream.domain.resume.Name;
import com.dream.util.JodaTimeUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-6
 * Time: 上午4:41
 */
@Data
@NoArgsConstructor
public class BasicInfoDTO {
    private String englishName;
    private String chineseName;
    private String birthday;
    private String phone;
    private String email;
    private String qq;
    private Gender gender;
    private String address;
    private String selfDescription;
    private MultipartFile portrait;

    public BasicInfoDTO(BasicInfo basicInfo) {
        Name name = basicInfo.name();
        this.englishName = name.englishName();
        this.chineseName = name.chineseName();
        this.birthday = basicInfo.birthday().toString();
        this.phone = basicInfo.phone();
        this.email = basicInfo.email();
        this.qq = basicInfo.qq();
        this.gender = basicInfo.gender();
        this.address = basicInfo.address();
        this.selfDescription = basicInfo.selfDescription();
    }

    public BasicInfo toBasicInfo() {
        Name name = new Name(this.chineseName, this.englishName);
        LocalDate birthday = JodaTimeUtil.parseLocalDate(this.birthday);
//        Portrait portrait = null;
//        try {
//            if (!this.portrait.isEmpty()) {
//                portrait = new Portrait(this.portrait.getOriginalFilename(), this.portrait.getContentType(), this.portrait.getBytes());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return new BasicInfo(name, birthday, this.phone, this.email, this.qq, this.gender, this.address, this.selfDescription);
    }
}
