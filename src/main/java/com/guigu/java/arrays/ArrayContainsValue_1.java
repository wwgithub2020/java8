package com.guigu.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Date: 2022/5/30 09:52
 * @Description: 检查数组是否包含值的四种不同方法
 * @Version 1.0.0
 */
public class ArrayContainsValue_1 {
    public static void main(String[] args) {
        String[] array = new String[]{"java","spring","spring boot","spring cloud"};
        boolean result = useListContainsValue(array, "java");
        System.out.println("结果是：" + result);
    }

    /**
     * 方式一：使用List
     * @param arr
     * @param targetValue
     * @return
     */
    public static boolean useListContainsValue(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

    /**
     * 方式二：使用set
     * @param arr
     * @param targetValue
     * @return
     */
    public static boolean useSetContains(String[] arr, String targetValue) {
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        return set.contains(targetValue);
    }

    /**
     * 方式三：使用循环
     * @param arr
     * @param targetValue
     * @return
     */
    public static boolean useRepeat(String[] arr, String targetValue) {
        for (String s : arr) {
            if (s.equals(targetValue) || s.contains(targetValue)) {
                return true;
            }
        }
        return false;
    }
}
