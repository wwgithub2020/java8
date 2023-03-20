package com.cloud.java.facedemo;

import java.io.*;

/**
 * @Date: 2022/4/20 10:02
 * @Description: 编写一个java程序将当16,17,18,19,20个数以数组的形式写入到Dest.txt文件中，并以相反的顺序独处显示在屏幕上。
 * @Version 1.0.0
 */
public class NumberTest_01 {
    public static void main(String[] args) throws IOException {
        int data[] = {16,17,18,19,20};
        int[] array = new int[200];

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("D:\\dest.txt"));
        for (int i = 0; i < data.length; i++) {
            outputStream.writeInt(data[i]);
        }
        outputStream.close();

        DataInputStream inputStream = new DataInputStream(new FileInputStream("D:\\dest.txt"));
        for (int j = 0; j < data.length; j++) {
            array[j] = inputStream.readInt();
        }
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
        inputStream.close();
    }
}
