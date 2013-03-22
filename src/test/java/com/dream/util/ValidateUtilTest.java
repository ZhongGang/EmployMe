package com.dream.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 下午8:38
 */
public class ValidateUtilTest {

    @Test
    public void testIsEmptyText() throws Exception {
        String text = "";
        boolean result = ValidateUtil.isEmptyText(text);
        Assert.assertTrue(result);

        text = null;
        result = ValidateUtil.isEmptyText(text);
        Assert.assertTrue(result);

        text = "   ";
        result = ValidateUtil.isEmptyText(text);
        Assert.assertTrue(result);

        text = "abc";
        result = ValidateUtil.isEmptyText(text);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsEmail() throws Exception {
        String email = null;
        boolean result = ValidateUtil.isEmail(email);
        Assert.assertFalse(result);

        email = "";
        result = ValidateUtil.isEmail(email);
        Assert.assertFalse(result);

        email = "   ";
        result = ValidateUtil.isEmail(email);
        Assert.assertFalse(result);

        email = "123@";
        result = ValidateUtil.isEmail(email);
        Assert.assertFalse(result);

        email = "123@321.com";
        result = ValidateUtil.isEmail(email);
        Assert.assertTrue(result);

        email = "123.abc@abc.cn";
        result = ValidateUtil.isEmail(email);
        Assert.assertTrue(result);

    }
}
