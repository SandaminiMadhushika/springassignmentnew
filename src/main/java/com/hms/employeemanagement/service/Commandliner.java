//package com.hms.employeemanagement.service;
//
//import com.hms.employeemanagement.model.Deptname;
//import com.hms.employeemanagement.model.Employee;
//import com.hms.employeemanagement.repo.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import com.hms.employeemanagement.service.EmployeeService;
//
//import javax.sql.DataSource;
//import java.util.Collection;
//import java.util.Date;
//import java.util.Optional;
//
//@Component
//public class Commandliner implements CommandLineRunner {
//    @Autowired
//    DataSource dataSource;
//
//    @Autowired
//    EmployeeRepository employeeRepository;
//@Autowired
//EmployeeService ep;
//
//
//    @Override
//
//    public void run(String... args) throws Exception {
//        Date t=new Date();
//       // Employee e1= new Employee("Madushanksa","Rathnayake","23","Male","SSS","967472018v","ymy aadderss","sanda96@gmail.com","7588876546",3,1,1,t);
//        ep.createEmployee(e1);
//        Iterable<Employee> nlist=ep.viewEmployee("Supun");
//        for(Employee nmodel:nlist){
//
//            System.out.println("Here is a system: " + nmodel.getFirstName().toString());
//
//        }
//
//        Iterable<Employee> dlist=ep.findByDdname("ENG");
//        for(Employee dmodel:dlist){
//
//            System.out.println("Here is a system: " + dmodel.getFirstName().toString());
//
//        }
//
//
//        System.out.println("Our DataSource is = " + dataSource);
//
//
//        Iterable<Employee> elist = employeeRepository.findAll();
//
//
//        for(Employee emodel:elist){
//
//            System.out.println("Here is a system: " + emodel.toString());
//
//        }
//
//    }
//
//
//
//
//}
