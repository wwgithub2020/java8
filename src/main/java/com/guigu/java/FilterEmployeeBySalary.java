package com.guigu.java;

import com.guigu.interfaces.MyPredicate;
import com.guigu.model.Employee;

/**
 * @Date: 2021/12/11 13:35
 * @Description: FilterEmployeeBySalary
 * @Version 1.0.0
 */
public class FilterEmployeeBySalary implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() > 5000;
    }
}
