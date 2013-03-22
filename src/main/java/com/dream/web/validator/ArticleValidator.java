package com.dream.web.validator;

import com.dream.dto.article.ArticleDTO;
import com.dream.util.ValidateUtil;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午7:47
 */
public class ArticleValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ArticleDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ArticleDTO articleDTO = (ArticleDTO) target;

        String title = articleDTO.getTitle();
        if (ValidateUtil.isEmptyText(title)) {
            errors.rejectValue("title", null, "Title should not be empty!");
        }

        String content = articleDTO.getContent();
        if (ValidateUtil.isEmptyText(content)) {
            errors.rejectValue("content", null, "Content should not be empty!");
        }
    }
}
