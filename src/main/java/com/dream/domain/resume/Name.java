package com.dream.domain.resume;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-5
 * Time: 下午9:58
 */
public class Name {
    private String chineseName;
    private String englishName;

    public Name() {
    }

    public Name(String chineseName, String englishName) {
        this.chineseName = chineseName;
        this.englishName = englishName;
    }

    public String chineseName() {
        return chineseName;
    }

    public String englishName() {
        return englishName;
    }
}
