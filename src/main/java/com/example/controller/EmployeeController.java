package com.example.controller;


import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/hello")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @PostMapping(value = "/employee/saveEmployee")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
        System.out.println("Request saveEmployee - " + employee);

        Employee emp = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }

    @GetMapping(value = "/employee/getAllEmployees")
    private ResponseEntity<?> getAllEmployee() {
        System.out.println("Request getAllEmployees");

        List<Employee> empList = employeeService.findAll();
        return new ResponseEntity(empList, HttpStatus.OK);
    }

}
