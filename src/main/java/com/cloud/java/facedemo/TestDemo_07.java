package com.cloud.java.facedemo;

/**
 * @Date: 2022/4/21 12:06
 * @Description: TestDemo_07
 * @Version 1.0.0
 */
public class TestDemo_07 {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);
        System.out.println(x.equals(y));

        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println(z == k);
        System.out.println(z.equals(k));
    }
}
