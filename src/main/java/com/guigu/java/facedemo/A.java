package com.guigu.java.facedemo;

/**
 * @Date: 2022/4/21 09:38
 * @Description: A
 * @Version 1.0.0
 */
public class A {
    public void show(A obj) {
        System.out.println("A.show(A)");
    }

    public void show(C obj) {
        System.out.println("A.show(C)");
    }
}

