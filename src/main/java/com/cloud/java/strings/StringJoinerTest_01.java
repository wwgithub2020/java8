package com.cloud.java.strings;

import org.junit.Test;

import java.util.StringJoiner;

/**
 * @CreateTime: 2023-05-19  14:27
 * @Description: 字符串拼接
 * @Version: 1.0
 */
public class StringJoinerTest_01 {

    @Test
    public void test_join_01() {
        StringJoiner joiner = new StringJoiner(",");
        String s = joiner.add("java").add("spring").add("redis").toString();
        System.out.println("测试结果是：" + s);
    }

}
