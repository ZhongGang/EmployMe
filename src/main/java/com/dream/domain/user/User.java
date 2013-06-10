package com.dream.domain.user;

import com.dream.domain.DomainObject;
import com.dream.domain.article.Article;
import com.dream.domain.resume.Resume;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午1:26
 */
@NoArgsConstructor
@AllArgsConstructor
public abstract class User extends DomainObject implements UserDetails {
    private String username;
    private String password;
    private String nickname;
    private String email;

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.active();
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public void changeInfo(String newPassword, String email, String nickname) {
        this.password = newPassword;
        this.email = email;
        this.nickname = nickname;
    }

    public void changeInfo(String email, String nickname) {
        this.email = email;
        this.nickname = nickname;
    }

    public List<Article> articles() {
        return Collections.emptyList();
    }

    public Resume resume() {
        return null;
    }

    public abstract boolean isAdministrator();
}
