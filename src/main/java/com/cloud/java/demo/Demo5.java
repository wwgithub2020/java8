package com.cloud.java.demo;

/**
 * @Date: 2022/3/16 19:18
 * @Description: Demo5
 * @Version 1.0.0
 */
public class Demo5 {

    public static boolean foot(char c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foot('A') ; foot('B') && (i < 2); foot('c')) {
            i++;
            foot('D');
        }
    }
}
