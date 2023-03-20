package com.cloud.java.strings;

/**
 * @Date: 2022/4/25 14:56
 * @Description: 用Java或JavaScript编写函数来查找字符串数组中的最长公共前缀，如果不存在公共前缀，则返回空字符串“”。
 *              输入[“hehe”,“hehe”,“head”]，结果为he。
 * @Version 1.0.0
 */
public class StringTest_02 {
    public static void main(String[] args) {
        String[] strArrays = new String[]{"hehe", "hehe", "head"};
        String prefix = searchPrefix(strArrays);
        System.out.println("返回的结果是：" + prefix);
    }

    /**
     * 方式一：查找字符串前缀
     * @param array
     * @return
     */
    public static String searchPrefix(String[] array) {
        if (array.length == 0) {
            return "";
        }
        String s1 = array[0];
        for (String s : array) {
            while (!s.startsWith(s1)) {
                if (s.length() == 0) {
                    return "";
                }
                s1 = s1.substring(0, s1.length() - 1);
            }
        }
        return s1;
    }


    /**
     * 方式二：查找字符串前缀
     * @param array
     * @return
     */
    public static void findPrefix(String[] array) {

    }
}
