package com.cloud.java.sorts;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @CreateTime: 2023-05-18  00:42
 * @Description: 使用Map按照指定进行排序
 * @Version: 1.0
 */
public class TestSort_02 {
    public static void main(String[] args) {
        Map<String, Integer> map = ImmutableMap.of("0",3,"1",10,"0.3",8,"1.2",6);

        System.out.println("根据map的key升序进行排序：" + sortByKey(map, false));
        System.out.println("根据map的value升序进行排序：" + sortByValue(map, false));
        System.out.println("根据map的value降序进行排序：" + sortByValue(map, true));
    }

    /**
     * 根据map的key值进行排序
     * @param map 待排序的map
     * @param isDesc 是否是降序，true：降序，false：升序
     * @return
     * @param <K>
     * @param <V>
     */
    public static <K extends Comparable<? super K>, V> Map<K,V> sortByKey(Map<K,V> map, boolean isDesc) {
        Map<K,V> result = Maps.newConcurrentMap();
        if (isDesc) {
            map.entrySet().stream().sorted(Map.Entry.<K,V>comparingByKey().reversed()).forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        } else {
            map.entrySet().stream().sorted(Map.Entry.<K,V>comparingByKey()).forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        }
        return result;
    }

    /**
     * 根据map的value值进行排序
     * @param map 待排序的map
     * @param isDesc 是否是降序，true：降序，false：升序
     * @return
     * @param <K>
     * @param <V>
     */
    public static <K,V extends Comparable<? super V>> Map<K,V> sortByValue(Map<K,V> map, boolean isDesc) {
        Map<K,V> result = Maps.newConcurrentMap();
        if (isDesc) {
            map.entrySet().stream().sorted(Map.Entry.<K,V>comparingByValue().reversed()).forEach(e -> result.put(e.getKey(), e.getValue()));
        } else {
            map.entrySet().stream().sorted(Map.Entry.<K,V>comparingByValue()).forEach(e -> result.put(e.getKey(), e.getValue()));
        }
        return result;
    }
}
