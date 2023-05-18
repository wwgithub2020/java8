package com.cloud.java;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @CreateTime: 2023-05-18  22:08
 * @Description: java8 之 filter 过滤
 * @Version: 1.0
 */
public class TestFilter_01 {
    public static void main(String[] args) {

    }

    @Test
    public void test_01() {
        List<Integer> list = findDivisors(10);
        System.out.println("结果是：" + list);
    }

    public static List<Integer> findDivisors(int number) {
        return Stream.iterate(1, k -> ++k)
                .limit(number)
                .filter(k -> number % k == 0)
                .collect(Collectors.toList());
    }
}
