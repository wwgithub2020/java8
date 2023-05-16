package com.cloud.java;

import com.cloud.model.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * @Date: 2021/12/12 17:07
 * @Description: TestStreamAPI_03
 * @Version 1.0.0
 */
public class TestStreamAPI_03 {
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

}
