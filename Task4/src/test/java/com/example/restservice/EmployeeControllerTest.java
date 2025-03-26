package com.example.restservice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EmployeeControllerTest {


    @Test
    void getAllEmployeesTest(){
        EmployeeManager mockedEmployeeManager = mock(EmployeeManager.class);
        EmployeeController employeeController = new EmployeeController(mockedEmployeeManager);
        Employees mockedEmployees = new Employees();
        when(mockedEmployeeManager.getEmployees()).thenReturn(mockedEmployees);
        Employees output = employeeController.getEmployeesList();
        assertEquals(mockedEmployees, output);

    }

    @Test
    void addEmployeeTest(){
        EmployeeManager mockedEmployeeManager = mock(EmployeeManager.class);
        EmployeeController employeeController = new EmployeeController(mockedEmployeeManager);
        Employee employee = new Employee("123", "demo first name", "demo last name", "demotesting@Gmail.com", "demo role");
        String result = employeeController.addEmployee(employee);
        verify(mockedEmployeeManager).addEmployee(employee);
        assertEquals("***Employee Added Successfully!***", result);
    }
}
