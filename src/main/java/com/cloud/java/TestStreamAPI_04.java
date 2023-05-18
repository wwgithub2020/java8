package com.cloud.java;

import com.cloud.model.SCInfo;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @CreateTime: 2023-05-19  00:56
 * @Description: 去重元素
 * @Version: 1.0
 */
public class TestStreamAPI_04 {

    @Test
    public void test_distinct_01() {
        List<SCInfo> list = new ArrayList<>();
        list.add(new SCInfo("A001", "KC001", 65.0));
        list.add(new SCInfo("A001", "KC002", 45.0));
        list.add(new SCInfo("A002", "KC002", 78.0));
        list.add(new SCInfo("A003", "KC003", 85.0));
        List<SCInfo> distinct = testDistinct(list);
        System.out.println("测试结果是：" + distinct);
    }

    public static List<SCInfo> testDistinct(List<SCInfo> list) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        return list.stream().
                collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(SCInfo::getSno))), ArrayList::new));
    }
}
