package com.example.service;

import com.example.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {

    Employee saveEmployee(Employee emp);

    List<Employee> findAll();


}
