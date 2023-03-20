package com.cloud.java.facedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @Date: 2022/4/21 11:55
 * @Description: TestDemo_6
 * @Version 1.0.0
 */
public class TestDemo_6 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D://dest.txt"));  // --1
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();  // --2
        }
    }
}
