package com.dream.util;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午6:25
 */
public class JodaTimeUtil {
    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static LocalDateTime now() {
        return new LocalDateTime();
    }

    public static LocalDate parseLocalDate(String localDateAsString) {
        if (ValidateUtil.isEmptyText(localDateAsString)) {
            return null;
        }
        return LocalDate.parse(localDateAsString);
    }

    public static String getLocalDateAsString(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return localDate.toString(DATE_FORMAT);
    }
}
