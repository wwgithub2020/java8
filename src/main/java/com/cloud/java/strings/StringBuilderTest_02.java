package com.cloud.java.strings;

import org.junit.Test;

import java.util.Objects;

/**
 * @CreateTime: 2023-05-18  21:30
 * @Description: 字符串反转
 * @Version: 1.0
 */
public class StringBuilderTest_02 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("java").reverse();
        System.out.println("字符串反转结果是：" + builder);
    }

    @Test
    public void testReverse_01() {
        String reverse = strReverse("熔断回调函数,无回调打印默认异常");
        System.out.println("结果是：" + reverse);
    }

    @Test
    public void testReverse_02() {
        String reverse = strToUpperCaseReverse("java and spring and cloud");
        System.out.println("结果是：" + reverse);
    }

    /**
     * 字符串反转方式一
     * @param str
     * @return
     */
    public static String strReverse(String str) {
        if (Objects.isNull(str)) {
            return null;
        }

        return new StringBuilder(str).reverse().toString();
    }

    /**
     * 先将字符串转换成大写再反转
     * @param str
     * @return
     */
    public static String strToUpperCaseReverse(String str) {
        if (Objects.equals(str, null)) {
            return null;
        }
        StringBuilder builder = new StringBuilder(str.toUpperCase());
        return builder.reverse().toString();
    }
}
