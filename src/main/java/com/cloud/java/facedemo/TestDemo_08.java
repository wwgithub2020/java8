package com.cloud.java.facedemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Date: 2022/4/21 13:42
 * @Description: TestDemo_08
 * @Version 1.0.0
 */
public class TestDemo_08 {
    public static void main(String[] args) {
        ExampleDemo example = new ExampleDemo();
        ExampleDemo example2 = new ExampleDemo();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> example.fun());
        executorService.execute(() -> example2.fun());
    }
}

class ExampleDemo {
    private Lock lock = new ReentrantLock();
    public void fun() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        } finally {
            lock.unlock();
        }
    }
}