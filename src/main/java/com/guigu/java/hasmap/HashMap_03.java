package com.guigu.java.hasmap;

import com.guigu.model.Goods;

import java.util.HashMap;

/**
 * @Date: 2022/4/15 22:20
 * @Description: 统计商品出现的次数
 * @Version 1.0.0
 */
public class HashMap_03 {
    public static void main(String[] args) {
        Goods goods = new Goods("鸡腿", 12);
        Goods goods1 = new Goods("火腿肠", 5);
        Goods goods2 = new Goods("火腿肠", 5);

        Goods[] array = new Goods[3];
        array[0] = goods;
        array[1] = goods1;
        array[2] = goods2;

        HashMap<Goods, Integer> map = new HashMap<>();

        for (Goods good : array) {
            // 如果该集合中不包含该商品，则说明是第一次出现。
            if (!map.containsKey(good)) {
                map.put(good, 1);
            } else {
                map.put(good, map.get(good) + 1);
            }
        }

        System.out.println("商品出现的次数：" + map);
    }
}
