package com.guigu.java.facedemo;

/**
 * @Date: 2022/4/20 11:22
 * @Description: TestDemo_04
 * @Version 1.0.0
 */
public class TestDemo_04 {
    public static void main(String[] args) {
        Integer x = new Integer(1);
        Integer y = Integer.valueOf(1);

        Long z = new Long(1L);

        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(y.longValue() == z);
    }
}
