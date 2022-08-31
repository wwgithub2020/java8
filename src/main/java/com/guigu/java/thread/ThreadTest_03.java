package com.guigu.java.thread;

/**
 * @Date: 2022/4/16 10:36
 * @Description: 交替打印
 * @Version 1.0.0
 */
public class ThreadTest_03 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        printer.print1();
                    }  catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                try {
                    printer.print2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}


class Printer{
    int flag = 1;

    public void print1() throws InterruptedException {
        synchronized (Printer.class) {
            if (flag != 1) {
                Printer.class.wait();
            }
            System.out.println("mysql");
            flag = 2;
            Printer.class.notify();
        }
    }

    public void print2() throws InterruptedException {
        synchronized (Printer.class) {
            if (flag != 2) {
                Printer.class.wait();
            }
            System.out.println("Linux");
            flag = 1;
            Printer.class.notify();
        }
    }
}