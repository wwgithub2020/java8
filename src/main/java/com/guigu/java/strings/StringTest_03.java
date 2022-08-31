package com.guigu.java.strings;

/**
 * @Date: 2022/4/30 21:52
 * @Description: 将字符串String str = "abcdefg";倒序输出
 * @Version 1.0.0
 */
public class StringTest_03 {
    public static void main(String[] args) {
        String str = "springboot";
        StringBuffer buffer = new StringBuffer(str);
        StringBuffer reverse = buffer.reverse();
        System.out.println("倒序后的字符串：" + reverse);

        System.out.println("------------------------------------");

        StringBuffer reversed = strReversed(str);
        System.out.println("反转之后的结果：" + reversed);
    }

    /**
     * 方法二：字符串反转
     * @param str
     */
    public static StringBuffer strReversed(String str) {
        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse();
    }
}
