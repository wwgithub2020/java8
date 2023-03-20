package com.cloud.java.demo;

/**
 * @Auther: adminwei
 * @Date: 2022/3/14 21:52
 * @Description: A
 * @Version 1.0.0
 */
public class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
    }
}
