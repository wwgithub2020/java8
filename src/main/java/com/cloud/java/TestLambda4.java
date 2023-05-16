package com.cloud.java;

import com.cloud.model.Student;

import java.util.Optional;

/**
 * @CreateTime: 2023-05-16  20:25
 * @Description: Optional 判空处理
 * @Version: 1.0
 */
public class TestLambda4 {
    public static void main(String[] args) {
        Student student = new Student("李四", 0);

        Optional<Student> optional = Optional.ofNullable(student);
        if (optional.isPresent()) {
            System.out.println("测试中");
        }
    }
}
