package com.cloud.java.strings;

import java.util.Arrays;
import java.util.List;

/**
 * @CreateTime: 2023-05-18  20:11
 * @Description: 字符串拼接
 * @Version: 1.0
 */
public class StringJoinTest_07 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "bar", "baz");
        String joined = String.join(" and ", list);
        System.out.println("拼接结果是：" + joined);
    }

}
