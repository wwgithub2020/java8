package com.cloud.java.hasmap;

import java.util.*;

/**
 * @Date: 2022/4/15 20:40
 * @Description: map遍历的四种方式
 * @Version 1.0.0
 */
public class HashMap_01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("sp001", "手机");
        map.put("sp002", "平板");
        map.put("sp003", "鼠标");
        map.put("sp004", "键盘");

        /**
         * 方式一：通过键找值的方式进行遍历
         */
        Set<String> set = map.keySet();
        for (String s : set) {
            String value = map.get(s);
            System.out.println("商品的编号为：" + s + "，商品的名称为：" + value);
        }

        System.out.println("---------------------------------------");

        /**
         * 方式二：获取键值对对象集合，迭代器遍历集合获取键和值
         * Set<Map.Entry<String, String>> entrySet：获取所有的键值对对象集合
         */
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("商品的编号为：" + key + "，商品的名称为：" + value);
        }

        System.out.println("---------------------------------------");

        /**
         * 方式三：获取键值对对象集合，增强for循环遍历集合获取键和值
         */
        Set<Map.Entry<String, String>> entrySetMap = map.entrySet();
        for (Map.Entry<String, String> entry : entrySetMap) {
            System.out.println("商品的编号为：" + entry.getKey() + "，商品的名称为：" + entry.getValue());
        }

        System.out.println("---------------------------------------");

        /**
         * 方式四：Map集合中的values方法拿到所有值
         */
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println("商品的名称为：" + value);
            System.out.println();
        }
    }
}
