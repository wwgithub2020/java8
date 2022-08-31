package com.guigu.java.strings;

import java.util.Scanner;

/**
 * @Date: 2022/5/18 21:20
 * @Description: StringTest_04
 * @Version 1.0.0
 */
public class StringTest_04 {
    public static void main(String[] args) {
        System.out.println("请输入一个0~99999之间的整数，再按回车键：");
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            if (n < 0 || n > 99999) {
                System.out.println("输入的数字超出范围！");
            }
            System.out.println("输入的数字为"
                    + (n < 10 ? 1 : n < 100 ? 2 : n < 1000 ? 3 : n < 10000 ? 4
                    : 5) + "位数");
        } catch (Exception e1) {
            System.out.println("输入错误！");
            e1.printStackTrace();
        }
    }
}
