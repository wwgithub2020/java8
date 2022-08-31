package com.guigu.java.demo;

/**
 * @Date: 2022/4/6 09:56
 * @Description: StringDemo_01
 * @Version 1.0.0
 */
public class StringDemo_01 {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");

        String A = "AB";
        String B = "AB";

        if (A == B) {
            System.out.println("A == B");
        }

        if (a == b) {
            System.out.println("a == b");
        }

        if (a.equals(b)) {
            System.out.println("a.equals(b)");
        }

        if (45 == 45.0) {
            System.out.println("true");
        }
    }
}
