package com.guigu.java.hasmap;

import com.guigu.model.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Date: 2022/4/22 14:53
 * @Description: TreeSet在排序时如何比较元素？
 * @Version 1.0.0
 */
public class TreeSetTest_01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("Spring Boot", 34));
        list.add(new Student("王五", 30));
        list.add(new Student("Spring Cloud Alibaba", 10));

        sortValue(list);
        System.out.println("------------------------------------");
        sortValue_2(list);
    }

    /**
     * 方式一：比较两个元素（学生的姓名进行相比较）
     * @param list
     * @return
     */
    public static void sortValue(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student student : list) {
            System.out.println("比较之后的数据：" + student);
        }
    }


    /**
     * 方式二：使用java8进行排序
     * @param list
     */
    public static void sortValue_2(List<Student> list) {
        List<Student> studentList = list.stream().sorted(Comparator.comparing(Student::getName, Comparator.reverseOrder())).collect(Collectors.toList());
        for (Student student : studentList) {
            System.out.println("比较之后的数据：" + student);
        }

    }
}
