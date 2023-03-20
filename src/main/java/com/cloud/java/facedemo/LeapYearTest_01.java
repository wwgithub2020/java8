package com.cloud.java.facedemo;

import java.util.Scanner;

/**
 * @Date: 2022/4/20 09:42
 * @Description: 判断某年某月是否是闰年
 * @Version 1.0.0
 */
public class LeapYearTest_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int line = scanner.nextInt();
        if (line % 4 == 0 && line % 100 != 0 || line % 400 == 0) {
            System.out.println("该年份是闰年");
        } else {
            System.out.println("该年份不是闰年");
        }
    }
}
