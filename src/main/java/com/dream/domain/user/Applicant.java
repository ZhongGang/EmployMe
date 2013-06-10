package com.dream.domain.user;

import com.dream.domain.article.Article;
import com.dream.domain.resume.Resume;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-20
 * Time: 上午12:00
 */
@NoArgsConstructor
public class Applicant extends User {
    private List<Article> articles = new ArrayList<Article>();
    private Resume resume;

    public Applicant(String username, String password, String nickname, String email) {
        super(username, password, nickname, email);
    }

    public List<Article> articles() {
        return articles;
    }

    public Resume resume() {
        return resume;
    }

    @Override
    public boolean isAdministrator() {
        return false;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authorities;
    }
}
