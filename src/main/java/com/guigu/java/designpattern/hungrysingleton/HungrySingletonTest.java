package com.guigu.java.designpattern.hungrysingleton;

/**
 * @Date: 2022/4/15 13:43
 * @Description: HungrySingletonTest【饿汉模式】
 * @Version 1.0.0
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton singleton = HungrySingleton.getInstance();
        System.out.println(instance == singleton);
    }
}

/**
 * 饿汉模式
 */
class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    public HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
