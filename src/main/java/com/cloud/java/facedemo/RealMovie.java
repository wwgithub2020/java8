package com.cloud.java.facedemo;

import com.cloud.interfaces.TestInterface_01;

/**
 * @Auther: adminwei
 * @Date: 2022/4/20 11:34
 * @Description: RealMovie
 * @Version 1.0.0
 */
public class RealMovie implements TestInterface_01 {
    @Override
    public void play() {
        System.out.println("您正在观看电影《肖生克的救赎》");
    }
}
