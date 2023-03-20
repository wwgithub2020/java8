package com.cloud.java.facedemo;

import com.cloud.interfaces.TestInterface_01;

/**
 * @Auther: adminwei
 * @Date: 2022/4/20 11:39
 * @Description: Cnima
 * @Version 1.0.0
 */
public class Cinema implements TestInterface_01 {

    RealMovie realMovie;

    @Override
    public void play() {
        guangGao(true);
        realMovie.play();
        guangGao(false);
    }

    public void guangGao(boolean isStarted) {
        if (isStarted) {
            System.out.println("电影马上开始了，爆米花、可乐、口香糖，快来买");
        } else {
            System.out.println("电影马上开始了，爆米花、可乐、口香糖，买回家了");
        }
    }
}
