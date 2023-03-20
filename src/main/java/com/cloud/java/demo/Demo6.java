package com.cloud.java.demo;

/**
 * @Date: 2022/3/16 19:32
 * @Description: Demo6
 * @Version 1.0.0
 */
public class Demo6 {
    void printValue(int m) {
        do {
            System.out.println("value:" + m);
        } while (--m > 10);
    }

    public static void main(String[] args) {
        int i = 10;
        Demo6 demo6 = new Demo6();
        demo6.printValue(i);
    }

}
