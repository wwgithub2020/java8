package com.cloud.java.facedemo;

import com.cloud.model.SCInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Date: 2022/4/21 09:00
 * @Description: TestDemo_05
 * @Version 1.0.0
 */
public class TestDemo_05 {
    public static void main(String[] args) {
        List<SCInfo> result = new ArrayList<>();
        result.add(new SCInfo("S001", "C001", 85.00));
        result.add(new SCInfo("S002", "C002", 95.5));
        result.add(new SCInfo("S003", "C003", 85.9));
        result.add(new SCInfo("S004", "C004", 78.5));

        Map<String, List<SCInfo>> traverse = traverse(result);
        System.out.println("打印" + traverse);
    }

    public static Map<String, List<SCInfo>> traverse(List<SCInfo> list) {
        Map<String, List<SCInfo>> map = new HashMap<>();
        for (SCInfo scInfo : list) {
            String sno = scInfo.getSno();
            if (map.get(sno) == null) {
                List<SCInfo> item = new ArrayList<>();
                item.add(scInfo);
                map.put(sno, item);
            } else {
                map.get(sno).add(scInfo);
            }
        }
        return map;
    }
}
