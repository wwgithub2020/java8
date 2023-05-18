package com.cloud.java.strings;

import org.junit.Test;

/**
 * @CreateTime: 2023-05-18  22:54
 * @Description: 字符串拼接
 * @Version: 1.0
 */
public class StringTest_07 {


    @Test
    public void testConcat() {
        String hello = concatStr("hello");
        System.out.println("结果是：" + hello);
    }

    public static String concatStr(String str) {
        return str.concat("java");
    }
}
