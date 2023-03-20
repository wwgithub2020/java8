package com.cloud.java.designpattern.innerclasssingleton;

/**
 * @Date: 2022/4/15 13:52
 * @Description: InnerClassSingletonTest
 * @Version 1.0.0
 */
public class InnerClassSingletonTest {
    public static void main(String[] args) {

    }
}

/**
 * 静态内部类
 */
class InnerClassSingleton {
    public static class InnerClassHolder {
        public static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public InnerClassSingleton() {
    }


}
