package com.cloud.java.facedemo;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Date: 2022/4/22 16:32
 * @Description:
 * 1.    碰到当前数字时，使用字母替换，例如，3-> A
 * 2.	碰到当前数字的倍数时，使用字母替换， 例如：6->A
 * 3.	碰到多个数字的倍数时，使用多个对应的字母替代，例如：15 -> AB，21->AC
 * 请根据映射表和规则，给出0-100之间的转换结果，提示：不要直接在for循环中使用if判断，尽可能的使用设计模式。
 *
 * @Version 1.0.0
 */
public class StringReplaceDemo_01 {
    public static void main(String[] args) {
        // 随机生成指定范围的数字【0~100】
        Random random = new Random();
        int nextInt = random.nextInt(100);
        getRandomNumber(nextInt);
    }

    /**
     * 获取随机数
     */
    public static boolean getRandomNumber(int number) {
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void replaceValue(String value) {
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(value);
    }
}
