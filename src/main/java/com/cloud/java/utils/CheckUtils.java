package com.cloud.java.utils;

import java.util.regex.Pattern;

/**
 * @CreateTime: 2023-04-17  15:46
 * @Description: 用于校验特殊逻辑
 * @Version: 1.0
 */
public class CheckUtils {

    /**
     * java自带的函数 ：判断字符串是否是数字
     * @param str 字符串
     * @return
     */
    public static boolean isNumeric(String str) {
        for (int i = str.length(); --i > 0 ;) {
            if (Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 使用正则表达式
     * @param str
     * @return
     */
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

}
