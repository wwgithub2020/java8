package com.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Date: 2021/12/11 13:01
 * @Description: Employee
 * @Version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {
    /**
     * 員工姓名
      */
    private String name;

    /**
     * 年齡
     */
    private int age;

    /**
     * 工資
     */
    private Double salary;

}
