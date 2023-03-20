package com.cloud.java;

import com.cloud.interfaces.MyPredicate;
import com.cloud.model.Employee;

/**
 * @Description: FilterEmployeeBySalary
 * @Version 1.0.0
 */
public class FilterEmployeeBySalary implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() > 5000;
    }
}
