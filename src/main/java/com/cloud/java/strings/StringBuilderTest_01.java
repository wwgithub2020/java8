package com.cloud.java.strings;

/**
 * @Date: 2022/4/16 09:35
 * @Description: StringBuilderTest_01
 * @Version 1.0.0
 */
public class StringBuilderTest_01 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("aaaaaabbbbbbcccccc");
        builder.delete(0,3);
        System.out.println(builder);
    }
}
