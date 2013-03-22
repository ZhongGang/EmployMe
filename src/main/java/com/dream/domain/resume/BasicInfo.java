package com.dream.domain.resume;

import com.dream.domain.attachment.Portrait;
import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午9:53
 */
public class BasicInfo {
    private Name name;
    private LocalDate birthday;
    private String phone;
    private String email;
    private String qq;
    private Gender gender;
    private String address;
    private String selfDescription;
    private Portrait portrait;

    public BasicInfo() {
    }

    public BasicInfo(Name name, LocalDate birthday, String phone, String email, String qq, Gender gender, String address, String selfDescription) {
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.qq = qq;
        this.gender = gender;
        this.address = address;
        this.selfDescription = selfDescription;
    }

    public Name name() {
        return name;
    }

    public LocalDate birthday() {
        return birthday;
    }

    public String phone() {
        return phone;
    }

    public String email() {
        return email;
    }

    public String qq() {
        return qq;
    }

    public Gender gender() {
        return gender;
    }

    public String address() {
        return address;
    }

    public String selfDescription() {
        return selfDescription;
    }

    public Portrait portrait() {
        return portrait;
    }
}
