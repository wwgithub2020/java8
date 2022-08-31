package com.guigu.java.facedemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Date: 2022/4/21 14:04
 * @Description: TestDemo_09
 * @Version 1.0.0
 */
public class TestDemo_09 {
    public static void main(String[] args) {
        final int threadSize = 1000;
        Example example = new Example();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                example.add();
            });
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println(example.get());
    }
}

class ThreadUnsafeExample {
    private int cnt = 0;
    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }
}

class Example {

    private int cnt = 0;
    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }
}