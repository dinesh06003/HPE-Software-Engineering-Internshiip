package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    public void setUp(){
        employeeManager = new EmployeeManager();
    }

    @Test
    public void testAddEmployee(){
        Employee employee = new Employee("123", "demo first name", "demo last name", "demotesting@Gmail.com", "demo role");
        employeeManager.addEmployee(employee);
        Employees employees = employeeManager.getEmployees();
        List<Employee> employeeList = employees.getEmployeeList();

    }
}
