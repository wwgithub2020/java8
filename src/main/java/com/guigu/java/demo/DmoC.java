package com.guigu.java.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 2022/3/16 19:11
 * @Description: DmoC
 * @Version 1.0.0
 */
public class DmoC {
    public static void change(String userId, List<String> childList) {
        userId = "123456789";
        childList.clear();
        childList.add(userId);
    }

    public static void main(String[] args) {
        String userId = "1419941011161358338";

        List<String> list = new ArrayList<>();
        list.add(userId);
        change(userId, list);
        System.out.println(userId);
        System.out.println(list.get(0));
    }
}
