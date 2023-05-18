package com.cloud.java.strings;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    public void testJoin_01() {
        String str = assignStr("java","Spring Boot", "Spring Cloud");
        System.out.println("结果是：" + str);
    }

    @Test
    public void testJoin_02() {
        String joinStr = joinStr("k8s", "spring", "java", "car", "blue");
        System.out.println("结果是：" + joinStr);
    }

    /**
     * 指定位置进行字符串拼接
     * @param args
     * @return
     */
    public static String assignStr(String... args) {
        return String.format("key:%s:route:%s", args);
    }

    /**
     * 字符串拼接
     * @param args
     * @return
     */
    public static String joinStr(String... args) {
        List<String> list = Arrays.stream(args).collect(Collectors.toList());
        return String.join("-", list);
    }
}
