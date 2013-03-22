package com.dream.util;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-2
 * Time: 下午6:23
 */
public class GuidGenerator {

    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
