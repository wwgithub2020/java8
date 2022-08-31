package com.guigu.java;

import com.guigu.interfaces.MyPredicate;
import com.guigu.model.Employee;
import org.junit.Test;

import java.util.*;

/**
 * @Date: 2021/12/11 12:49
 * @Description: TestLambda
 * @Version 1.0.0
 */
public class TestLambda {

    @Test
    public void test_1() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> set = new TreeSet<>(comparator);
    }

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
        new Employee("王超", 45, 4800.00)
    );

    @Test
    public void test_2() {
        List<Employee> list = filterEmploy(this.list);
        System.out.println(list);
    }

    /**
     * 需求一：获取公司中员工年龄 > 35 的员工信息
     */
    public List<Employee> filterEmploy(List<Employee> employeeList) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getAge() > 35) {
                list.add(employee);
            }
        }
        return list;
    }

    /**
     * 需求二：获取公司中员工薪资 > 5000 的员工信息
     */
    public List<Employee> filterEmploySalary(List<Employee> employeeList) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getSalary() > 5000) {
                list.add(employee);
            }
        }
        return list;
    }

    /**
     * 按照员工年龄过滤
     */
    @Test
    public void test_3() {
        List<Employee> employees = filterEmployee(list, new FilterEmployeeByAge());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /**
     * 按照员工薪资过滤
     */
    @Test
    public void test_4() {
        List<Employee> employees = filterEmployee(list, new FilterEmployeeBySalary());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /**
     * 优化方式一：采用设计模式
     */
    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> predicate) {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : list) {
            if (predicate.test(employee)) {
                employees.add(employee);
            }
        }
        return employees;
    }

    /**
     * 优化方式二：匿名内部类
     */
    @Test
    public void test_5() {
        List<Employee> employees = filterEmployee(list, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() < 5000;
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /**
     * 优化方式三：使用lambda表达式
     */
    @Test
    public void test_6() {
        List<Employee> employees = filterEmployee(list, employee -> employee.getSalary() < 5000);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /**
     * 优化方式四：使用stream API
     */
    @Test
    public void test_7() {
        list.stream().filter(employee -> employee.getSalary() > 7000).forEach(System.out::println);
    }
}
