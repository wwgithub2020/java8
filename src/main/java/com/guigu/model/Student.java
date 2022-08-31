package com.guigu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Date: 2022/4/22 14:54
 * @Description: Student
 * @Version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;
}
