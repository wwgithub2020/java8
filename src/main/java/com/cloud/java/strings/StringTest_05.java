package com.cloud.java.strings;

/**
 * @Date: 2022/5/19 10:17
 * @Description: StringTest_05
 * @Version 1.0.0
 */
public class StringTest_05 {

    public static final StringBuffer buffer = new StringBuffer("SpringBoot");

    public static void main(String[] args) {
        StringBuffer buffer = StringTest_05.buffer.append(" And SpringCloud");
        System.out.println(buffer);
    }
}
