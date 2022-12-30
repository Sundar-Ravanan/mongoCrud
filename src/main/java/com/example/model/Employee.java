package com.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "emp")
public class Employee {

    @Id
    private String id;

    private String name;
    private long salary;
    private String currency;
    private String department;
    private boolean onContract;
    private String subDepartment;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", currency='" + currency + '\'' +
                ", department='" + department + '\'' +
                ", onContract=" + onContract +
                ", subDepartment='" + subDepartment + '\'' +
                '}';
    }

}
