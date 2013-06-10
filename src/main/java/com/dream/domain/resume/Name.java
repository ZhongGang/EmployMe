package com.dream.domain.resume;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午9:58
 */
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    private String chineseName;
    private String englishName;

    public String chineseName() {
        return chineseName;
    }

    public String englishName() {
        return englishName;
    }
}
