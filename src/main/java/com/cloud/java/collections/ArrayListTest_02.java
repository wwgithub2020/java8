package com.cloud.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: List里面如何剔除相同的对象？
 * @Version 1.0.0
 */
public class ArrayListTest_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("34");
        list.add("35");
        list.add("36");
        list.add("36");

        HashSet<String> set = repeat_01(list);
//        List<String> hashSet = repeat_02(list);
//        List<String> list1 = repeat_03(list);
        System.out.println("去重之后的数据：" + set);

    }

    /**
     * 方式一
     * @param list
     * @return
     */
    public static HashSet<String> repeat_01(List<String> list) {
        System.out.println("去重之前的数据：" + list);
        HashSet<String> set = new HashSet<>();
//        for (int i = 0; i < list.size(); i++) {
//            set.add(list.get(i));
//        }
        for (String s : list) {
            if (!set.contains(s)) {
                set.add(s);
            }
        }
        return set;
    }

    /**
     * 方式二：使用HashSet进行去重
     * @param list
     * @return
     */
    public static List<String> repeat_02(List<String> list) {
        System.out.println("去重之前的数据：" + list);
        List<String> hashSet = new ArrayList<>(list.size());
        for (String s : list) {
            if (!hashSet.contains(s)) {
                hashSet.add(s);
            }
        }
        return hashSet;
    }

    /**
     * 方式三：使用java8新特性进行去重
     * @param list
     * @return
     */
    public static List<String> repeat_03(List<String> list) {
        System.out.println("去重之前的数据：" + list);
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        return collect;
    }
}
