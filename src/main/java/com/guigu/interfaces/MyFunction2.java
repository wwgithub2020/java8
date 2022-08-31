package com.guigu.interfaces;

/**
 * @Date: 2021/12/11 15:54
 * @Description: MyFunction2
 * @Version 1.0.0
 */
@FunctionalInterface
public interface MyFunction2<T, R> {
    public R getValue(T t1, T t2);
}
