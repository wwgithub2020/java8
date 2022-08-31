package com.guigu.java;

import com.guigu.interfaces.MyPredicate;
import com.guigu.model.Employee;

/**
 * @Date: 2021/12/11 13:25
 * @Description: FilterEmployeeByAge
 * @Version 1.0.0
 */
public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 35;
    }

}
