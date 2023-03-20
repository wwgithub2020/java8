package com.cloud.java.demo;

/**
 * @Date: 2022/3/16 19:16
 * @Description: Dmo4
 * @Version 1.0.0
 */
public class Dmo4 {
    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num = num + i;
            count = count ++;
        }
        System.out.println(num);
        System.out.println(count);
        System.out.println(num*count);
    }
}
