package com.guigu.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Date: 2022/4/18 13:41
 * @Description: 多线程场景下如何使用 ArrayList？
 * @Version 1.0.0
 */
public class ArrayListTest_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("張三");
        list.add("李四");
        list.add("王五");
        list.add("趙六");

        List<String> synchronizedList = Collections.synchronizedList(list);
        for (String s : synchronizedList) {
            System.out.println(s);
        }
    }
}
