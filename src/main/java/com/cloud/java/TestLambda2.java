package com.cloud.java;

import com.cloud.interfaces.MyFunction;
import com.cloud.interfaces.MyFunction2;
import com.cloud.model.Employee;
import org.junit.Test;

import java.util.*;

/**
 * @Description: TestLambda2
 * @Version 1.0.0
 *
 *
 * 左侧：Lambda 表达式的参数列表
 * 右侧：Lambda 表达式中所需执行的功能，即Lambda体
 *
 * 语法格式一：无参数，无返回值
 *      () -> System.out.println("Hello Lambda表达式!")
 *
 * 语法格式二：有一个参数，并且无返回值
 *      (x) -> System.out.println(x)
 *
 * 语法格式三：有一个参数，小括号可以省略不写
 *      x -> System.out.println
 *
 * 语法格式四：有两个以上的参数，有返回值，并且Lambda体中有多条语句
 *           Comparator<Integer> c = (x, y) -> {
 *               System.out.println("函数式接口");
 *               return Integer.compare(x, y);
 *           };
 */
public class TestLambda2 {
    /**
     * 初始化数据
     */
    List<Employee> list = Arrays.asList(
            new Employee("张三", 34, 6789.00),
            new Employee("李四", 24, 9999.00),
            new Employee("王五", 44, 6666.00),
            new Employee("赵六", 56, 8000.00),
            new Employee("马汉", 45, 8500.00),
            new Employee("张玲", 45, 4500.00),
            new Employee("王超", 45, 4800.00)
    );

    @Test
    public void test_1() {
        Comparator<Integer> c = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

    /**
     * 先按年龄比，年龄相同按姓名比
     */
    @Test
    public void test_2() {
        Collections.sort(list, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    @Test
    public void test_3() {
        String s = strHandler("\t\t\t\t Hello Lambda表达式", str -> str.trim());
        System.out.println(s);

        String asdffa = strHandler("asdffa", str -> str.toUpperCase());
        System.out.println("将字符串转成大写" + asdffa);
    }

    @Test
    public void test_4() {
        calculateValue(100L, 300L, (x, y) -> x + y);

        calculateValue(100L, 300L, (x, y) -> x * y);
    }

    /**
     * 字符串处理
     * @param str
     * @param function
     * @return
     */
    public String strHandler(String str, MyFunction function) {
        return function.getValue(str);
    }

    /**
     * 计算两个数的值
     * @return
     */
    public void calculateValue(Long l1, Long l2, MyFunction2<Long, Long> function) {
        System.out.println(function.getValue(l1, l2));
    }
}
