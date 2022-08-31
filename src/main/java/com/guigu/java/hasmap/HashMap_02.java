package com.guigu.java.hasmap;

import com.guigu.model.Employee;

import java.util.HashMap;

/**
 * @Date: 2022/4/15 21:22
 * @Description: HashMap特性
 * Map特点：
 *  1、map是双列集合，将键映射到值的对象；
 *  2、map集合的数据结构，只针对键有效，跟值没有关系；
 *  3、一个映射不能包含重复的键，每个键最多只能映射一个值
 *
 *
 * @Version 1.0.0
 */
public class HashMap_02 {
    /**
     * 问题一：map中键是如何保证唯一的？
     *      解决方法：
     *          需要hashCode和equals两个方法的配合使用.
     *              当我们调用添加的方法向集合中添加元素的时候，首先会调用该对象的hashCode方法计算出哈希值（int整数）。
     *              拿着计算出的哈希值去集合中查找是否有相同的。
     *              如果没有，直接存储；如果有，调用equals方法逐个比较元素内容
     * @param args
     */
    public static void main(String[] args) {
        HashMap<Employee, String> map = new HashMap<>();
        map.put(new Employee("张三", 23, 5000.00), "北京");
        map.put(new Employee("李四", 25, 8000.00), "上海");
        map.put(new Employee("王五", 35, 10000.00), "广州");
        map.put(new Employee("王五", 35, 15000.00), "广州");
        System.out.println(map);
    }
}
