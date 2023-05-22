package com.cloud.java.strings;

import org.junit.Test;

import java.util.Objects;

/**
 * @CreateTime: 2023-05-22  17:17
 * @Description: 字符串反转
 * 1、String、StringBuffer、StringBuilder三者的区别
 *      String: 不可变的字符序列;底层使用char[]存储
 *      StringBuffer:可变的字符序列;线程安全;效率低;底层使用char[]存储
 *      StringBuilder:可变的字符序列;jdk5.0新增 线程不安全;效率高;底层使用char[]存储
 *    执行效率：StringBuilder > StringBuilder > String
 *
 * @Version: 1.0
 */
public class StringTest_08 {

    @Test
    public void test_reverse_01() {
        String reverse_result = str_reverse_method_01("springboot", 3, 7);
        System.out.println("测试结果是：" + reverse_result);
    }

    @Test
    public void test_reverse_02() {
        String reverse_result = str_reverse_method_02("springcloud", 2, 6);
        System.out.println("测试结果是：" + reverse_result);
    }

    @Test
    public void test_reverse_03() {
        String reverse_result = str_reverse_method_03("HelloWorld", 3, 7);
        System.out.println("测试结果是：" + reverse_result);
    }

    /**
     * 讲一个字符串进行反转，将字符串中指定部分进行反转，比如："abcdefg"反转为"abfedcg"
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public String str_reverse_method_01(String str, int startIndex, int endIndex) {
        if (!Objects.equals(str, null) && str.length() != 0) {
            char[] chars = str.toCharArray();
            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            return new String(chars);
        }
        return null;
    }

    public String str_reverse_method_02(String str, int startIndex, int endIndex) {
        if (!Objects.equals(str, null) && str.length() != 0) {
            String substring = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                substring += str.charAt(i);
            }
          substring += str.substring(endIndex + 1);
            return substring;
        }
        return null;
    }

    public String str_reverse_method_03(String str, int startIndex, int endIndex) {
        if (!Objects.equals(str, null)) {
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0, startIndex));
            for (int i = endIndex; i >= startIndex; i--) {
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        }
        return null;
    }
}
