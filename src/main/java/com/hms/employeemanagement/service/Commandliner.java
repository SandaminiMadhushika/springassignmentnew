package com.hms.employeemanagement.service;

import com.hms.employeemanagement.model.Employee;
import com.hms.employeemanagement.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;

public class Commandliner implements CommandLineRunner {
    @Autowired
    DataSource dataSource;

    @Autowired
    EmployeeRepository employeeRepository;

    @Override

    public void run(String... args) throws Exception {

        System.out.println("Our DataSource is = " + dataSource);

        Iterable<com.hms.employeemanagement.model.Employee> elist = employeeRepository.findAll();

        for(com.hms.employeemanagement.model.Employee emodel:elist){

            System.out.println("Here is a system: " + emodel.toString());

        }

    }




}
