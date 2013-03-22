package com.dream.util;

import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-4
 * Time: 下午4:53
 */
public class ValidateUtil {
    public static final String EMPTY_STRING = "";
    public static final String EMAIL_REGULAR_EXPRESSION = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

    public static boolean isEmptyText(String text) {
        return text == null || text.trim().equals(EMPTY_STRING);
    }

    public static boolean isEmail(String text) {
        return !isEmptyText(text) && Pattern.matches(EMAIL_REGULAR_EXPRESSION, text);
    }
}
