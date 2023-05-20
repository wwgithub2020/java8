package com.cloud.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @CreateTime: 2023-05-19  10:32
 * @Description: java8常用API
 * @Version: 1.0
 */
public class TestStreamAPI_05 {

    /**
     *  跳过前n个元素，要第n个以后的数据
     */
    @Test
    public void test_01() {
        List<String> list = Arrays.asList("spring", "java", "redis", "boot", "cloud", "");
        List<String> collect = list.stream().skip(3).collect(Collectors.toList());
        System.out.println("测试结果是：" + collect);
    }

    /**
     * 过滤元素
     */
    @Test
    public void test_02() {
        List<String> list = Arrays.asList("spring", "java", "redis", "boot", "cloud", "");
        List<String> collect = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("测试结果是：" + collect);
    }

    /**
     * 返回集合中第一个元素
     */
    @Test
    public void test_03() {
        List<String> list = Arrays.asList("spring", "java", "redis", "boot", "cloud", "");
        Optional<String> first = list.stream().findFirst();
        System.out.println("测试结果是：" + first);
    }

    /**
     * 取前n个元素
     */
    @Test
    public void test_04() {
        List<String> list = Arrays.asList("spring", "java", "redis", "boot", "cloud", "");
        List<String> collect = list.stream().limit(3).collect(Collectors.toList());
        System.out.println("测试结果是：" + collect);
    }
}
