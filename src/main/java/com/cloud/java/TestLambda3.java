package com.cloud.java;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @Date: 2021/12/12 10:28
 * @Description: TestLambda3
 * @Version 1.0.0
 *
 * Consumer<T>：消费型接口
 *      void accept(T t);
 *
 * Supplier<T>：提供型接口
 *      T get();
 *
 * Function<T, R>：函数型接口
 *      R apply(T t);
 *
 * Predicate<T>：断言型接口
 *      boolean test(T t)
 */
public class TestLambda3 {
    /**
     * 消费提供者
     */
    @Test
    public void test_1() {
        happy(10000, m -> System.out.println("今天买了生活用品共花了：" + m + "元"));
    }

    public void happy(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }
}
