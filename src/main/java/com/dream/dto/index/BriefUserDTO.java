package com.dream.dto.index;

import com.dream.domain.article.Article;
import com.dream.domain.resume.Resume;
import com.dream.domain.user.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-18
 * Time: 上午12:25
 */
@Getter
public class BriefUserDTO {
    private String guid;
    private String nickname;
    private BriefResumeDTO briefResumeDTO;
    private List<BriefArticleDTO> briefArticleDTOs = new ArrayList<BriefArticleDTO>();

    public BriefUserDTO(User user) {
        this.guid = user.guid();
        this.nickname = user.getNickname();
        Resume resume = user.resume();
        if (resume != null) {
            this.briefResumeDTO = new BriefResumeDTO(resume);
        }
        List<Article> articles = user.articles();
        for (Article article : articles) {
            BriefArticleDTO briefArticleDTO = new BriefArticleDTO(article);
            briefArticleDTOs.add(briefArticleDTO);
        }
    }
}
