package com.cloud.java.facedemo;

/**
 * @Date: 2022/4/20 11:15
 * @Description: TestDemo_03
 * @Version 1.0.0
 */
public class TestDemo_03 {
    public static void main(String[] args) {
        int value = getValue(2);
        System.out.println(value);
    }

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}
