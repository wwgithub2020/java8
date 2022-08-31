package com.guigu.java.check;


import cn.hutool.core.util.ObjectUtil;

import java.util.Objects;

/**
 * @Date: 2022/1/9 10:01
 * @Description: ObjectsDemo01
 * @Version 1.0.0
 */
public class ObjectsDemo01 {
    public static void main(String[] args) {
        String name = "";
//        if (Objects.nonNull(name)) {
//            System.out.println("打印错误信息");
//        }

//        if (!Objects.isNull(name)) {
//            System.out.println("执行了");
//        }

        if (!Objects.equals(null, name)) {
            System.out.println("测试比较值是否相等");
        }

    }
}
