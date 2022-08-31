package com.guigu.java.thread;

/**
 * @Date: 2022/4/16 10:21
 * @Description: ThreadTest_02
 * @Version 1.0.0
 */
public class ThreadTest_02 {
    public static void main(String[] args) throws InterruptedException {
//        sleepMethod();
        waitMethod();
    }

    private static void sleepMethod() throws InterruptedException{
        for (int i = 0; i <= 5; i++) {
            System.out.println("Spring Boot");
            // 让当前程序在此休眠，休眠过后自动醒来，继续执行程序
            Thread.sleep(1000);
        }
    }

    private static void waitMethod() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Spring Cloud");
            ThreadTest_02.class.wait(1000);
        }
    }
}
