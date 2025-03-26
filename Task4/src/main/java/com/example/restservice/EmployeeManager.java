package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Employee("1", "Sai Dinesh", "Reddy", "dineshdemo@gmail.com", "Manager"));
        listOfEmployee.add(new Employee("2", "Goutham", "Reddy", "gouthamdemo@gmail.com", "Developer"));
        listOfEmployee.add(new Employee("3", "Ravi", "Komaati", "ravidemo@gmail.com", "Developer"));
        listOfEmployee.add(new Employee("4", "Andrew", "kane", "andrewdemo@gmail.com", "QA"));
        listOfEmployee.add(new Employee("5", "Kyathi", "rain", "kyathidemo@gmail.com", "Designer"));
        employees = new Employees();
        employees.setEmployeeList(listOfEmployee);
    }
    public Employees getEmployees(){
        return employees;
    }

    public void addEmployee(Employee employee) {
        List<Employee> employeeList = employees.getEmployeeList();
        employeeList.add(employee);
        employees.setEmployeeList(employeeList);

    }
}
