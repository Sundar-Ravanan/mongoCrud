package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    @Override
    public Employee saveEmployee(Employee emp) {
        System.out.println("EmployeeServiceImpl - saveEmployee - Employee emp - " + emp);
        Employee employee = employeeRepository.save(emp);
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        System.out.println("EmployeeServiceImpl - findAll");
        List<Employee> employeeList = employeeRepository.findAll();
        System.out.println("EmployeeServiceImpl - findAll - employeeList - " + employeeList);
        return employeeList;
    }


}
