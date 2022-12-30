package com.example.config;


import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.repository")
@PropertySource("classpath:application.properties")
public class MongoConfig {

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeServiceImpl();
    }

}
