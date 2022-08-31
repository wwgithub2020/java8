package com.guigu.java.facedemo;

/**
 * @Date: 2022/4/11 12:17
 * @Description: 控制台输入十个整数，接着将第1个和第10个，第2个和第9个，以此类推互换位置，最后输出原本的10个数字和更改位置后的10个数字
 * @Version 1.0.0
 */
public class TestDemo_01 {
    public static void main(String[] args) {
        // 创建数组
        int[] a = {6, 4, 2, 1, 5, 9, 3, 31, 45};
        // 假设第一个数位最大数
        int sum = a[0];
        // 假设第一位数为最小数
        int sum2 = a[0];
        // 遍历数组   求出来最大值
        for (int j = 0; j < a.length; j++) {
            // 如果遍历的数大于第一位数时  那么最大数变成sum
            if (a[j] > sum) {
                sum = a[j];
            }
           // 如果遍历的数小于第一位数时  那么最小数变成sum2
            else if (a[j] < sum2) {
                sum2 = a[j];
            }
        }
        // 让最大值和第一位数交换位置
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) {
                a[i] = a[0];
            }
        }
        // 让最小值和最后一位数交换位置
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2] == sum2) {
                a[i2] = a[a.length - 1];
            }
        }
        // 让第一位数和最大值交换位置
        a[0] = sum;
        // 最后一位数和最小值交换位置
        a[a.length - 1] = sum2;
        // 最后输出数组
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
