package com.dream.util;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-20
 * Time: 下午7:58
 */
public class GuidGeneratorTest {

    @Test
    public void testGuidGenerate() throws Exception {
        System.out.println(GuidGenerator.generate());
    }
}
