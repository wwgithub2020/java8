package com.cloud.java.strings;

/**
 * @Date: 2022/4/16 09:29
 * @Description: StringTest_01
 * @Version 1.0.0
 */
public class StringTest_01 {
    /**
     *  String类比较特殊，直接写一个双引号，实际上就是创建了一个字符串对象
     * @param args
     */
    public static void main(String[] args) {
        String str = "adc";
        str = "asd";
        System.out.println(str);
    }
}
