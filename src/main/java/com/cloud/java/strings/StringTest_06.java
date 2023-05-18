package com.cloud.java.strings;

import com.cloud.model.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @CreateTime: 2023-05-18  16:40
 * @Description: TODO
 * @Version: 1.0
 */
public class StringTest_06 {
    public static void main(String[] args) {
        List<Employee> listData = initData();
        boolean contains = isContains(listData, "D");
        System.out.println("" + contains);
    }

    @Test
    public void test_01() {
        List<Employee> listData = initData();
        boolean contains = isContains(listData, "D");
        System.out.println("" + contains);
    }

    /**
     * 判断是否包含某个元素
     * @param employee
     * @param value
     * @return
     */
    public static boolean isContains(List<Employee> employee, String value) {
        if (employee.contains(value)) {
            return true;
        }
        return false;
    }

    /**
     * 初始化数据
     */
    public static List<Employee> initData() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("A", 22, 7000.00));
        list.add(new Employee("A", 24, 9000.00));
        list.add(new Employee("B", 32, 7000.00));
        list.add(new Employee("B", 26, 9000.00));
        list.add(new Employee("C", 27, 7000.00));
        list.add(new Employee("C", 28, 10000.00));
        list.add(new Employee("D", 30, 15000.00));
        list.add(new Employee("D", 22, 7500.00));
        list.add(new Employee("E", 25, 8000.00));
        list.add(new Employee("E", 26, 8000.00));
        return list;
    }
}
