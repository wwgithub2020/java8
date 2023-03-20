package com.cloud.java.facedemo;

/**
 * @Date: 2022/4/8 17:24
 * @Description: 输入一个整形数组，求一个整型数组元素中最接近其平均值的整数【百度面试题】
 * @Version 1.0.0
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] avgVal = {13,46,41,11,20,3,6,41,89,65,24,11};
        Integer value = avgValue(avgVal);
        System.out.println("一个整型数组元素中最接近其平均值的整数：" + value);
    }

    public static Integer avgValue(int[] value) {
        // 所有元素和
        double sum = 0;
        // 平均值
        double avgVal = 0;
        double parse = 0;
        // 返回结果值
        int result = 0;

        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        avgVal = sum / value.length;

        System.out.println("平均值：" + avgVal);

        parse = Math.abs(avgVal - value[0]);
        for (int i = 0; i < value.length; i++) {
            if (parse > Math.abs(avgVal - value[i])) {
                // 差值的绝对值
                parse = Math.abs(avgVal - value[i]);
                result = value[i];
            }
        }
        return result;
    }
}
