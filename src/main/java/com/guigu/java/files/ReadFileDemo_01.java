package com.guigu.java.files;

import java.io.InputStream;

/**
 * @Date: 2022/4/22 16:45
 * @Description: 如何在springboot启动时，获取/data/目录下的所有文件名
 * @Version 1.0.0
 */
public class ReadFileDemo_01 {
    public static void main(String[] args) {
        InputStream stream =  Thread.currentThread().getContextClassLoader().getResourceAsStream("dest.txt");
        System.out.println("值：" + stream);
    }
}
