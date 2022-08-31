package com.guigu.java;

import com.guigu.model.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Date: 2021/12/12 16:24
 * @Description: TestStreamAPI_02
 * @Version 1.0.0
 */
public class TestStreamAPI_02 {
    /**
     * 初始化数据
     */
    List<Employee> list = Arrays.asList(
            new Employee("张三", 34, 6789.00),
            new Employee("李四", 24, 9999.00),
            new Employee("王五", 44, 6666.00),
            new Employee("赵六", 56, 8000.00),
            new Employee("马汉", 45, 8500.00),
            new Employee("张玲", 45, 4500.00),
            new Employee("王超", 45, 4800.00),
            new Employee("王超", 45, 4800.00),
            new Employee("王超", 45, 4800.00)
    );

    /**
     * 内部迭代：迭代操作由stream API操作
     */
    @Test
    public void test_1() {
        Stream<Employee> stream = list.stream().filter(s -> s.getAge() > 35);
        stream.forEach(System.out::println);
    }

    /**
     * 外部迭代
     */
    @Test
    public void test_2() {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 截断操作
     */
    @Test
    public void test_3() {
        list.stream().filter(s -> s.getSalary() > 5000).limit(2).forEach(System.out::println);
    }

    /**
     * 跳过元素
     */
    @Test
    public void test_4() {
        list.stream().filter(s -> s.getSalary() > 5000).skip(2).forEach(System.out::println);
    }

    /**
     * 去重操作：
     *      distinct通过流所生成元素的hashCode()和equals()去除重复元素
     */
    @Test
    public void test_5() {
        list.stream().distinct().filter(s -> s.getName() == "王超").forEach(System.out::println);
    }

    /**
     * map映射
     */
    @Test
    public void test_6() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg");
        List<String> collect = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }
    }

    @Test
    public void test_7() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg");
        Stream<Stream<Character>> streamStream = list.stream().map(TestStreamAPI_02::filterCharacter);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });
    }

    /**
     * flagMap
     */
    @Test
    public void test_8() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg");
        list.stream().flatMap(TestStreamAPI_02::filterCharacter).forEach(System.out::println);
    }

    /**
     * 字符串过滤
     * @param str
     * @return
     */
    public static Stream<Character> filterCharacter(String str) {
        List<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }
}
