package com.cloud.java;

import com.cloud.model.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Date: 2021/12/12 15:48
 * @Description: TestStreamAPI_01
 * @Version 1.0.0
 *
 * Stream 的三个操作步骤
 * 1、创建stream
 * 2、中间操作
 * 3、终止操作（终端操作）
 */
public class TestStreamAPI_01 {

    @Test
    public void test_1() {
        // 1、创建stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        // 2、通过Arrays中的静态方法stream()获取数组流
        Employee[] employee = new Employee[10];
        Stream<Employee> employeeStream = Arrays.stream(employee);

        // 3、通过stream类中的静态方法of()
        Stream<Object> objectStream = Stream.of();

        // 4、创建无限流
        Stream<Integer> iterate = Stream.iterate(0, x -> x + 10);
    }
}
