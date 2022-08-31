package com.guigu.java.java9;

import com.guigu.model.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Date: 2022/4/7 14:46
 * @Description:    list集合中如何去掉重复数据
 * @Version 1.0.0
 */
public class TestContainsDemo_01 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("张三", 23, 5000.00));
        list.add(new Employee("李四", 25, 7000.00));
        list.add(new Employee("王五", 30, 8500.00));
        list.add(new Employee("王五", 35, 8200.00));
        list.add(new Employee("王五", 30, 8500.00));

        List<Employee> newList = new ArrayList<>();
        for (Employee employee : list) {
            if (!newList.contains(employee)) {
                newList.add(employee);
            }
        }
        System.out.println("方式一：打印新的集合数据：" + newList);

        List<Employee> employeeList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("方式二：打印去重数据：" + employeeList);

        HashSet<Employee> set = new HashSet<>(list);
        newList.addAll(set);
        System.out.println("方式三：打印去重后的集合数据" + set);
    }
}
