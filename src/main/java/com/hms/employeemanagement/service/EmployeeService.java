package com.hms.employeemanagement.service;

import com.hms.employeemanagement.model.Employee;
import com.hms.employeemanagement.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public Employee createEmployee(Employee entity)
    {
        Optional<Employee> employee = repository.findById((long) entity.getEmployee_id());

        if(employee.isPresent())
        {
            Employee newEntity = employee.get();
            newEntity.setfName(entity.getfName());
            newEntity.setlName(entity.getlName());
            newEntity.setAge(entity.getAge());
            newEntity.setGender(entity.getGender());
            newEntity.setDesignation(entity.getDesignation());
            newEntity.setAddress(entity.getAddress());
            newEntity.setEmail(entity.getEmail());
            newEntity.setMobileNum(entity.getMobileNum());
            newEntity.setFactionId(entity.getFactionId());
            newEntity.setSubId(entity.getSubId());
            newEntity.setNic(entity.getNic());            //departmentId



            newEntity = repository.save(newEntity);

            return newEntity;
        } else {
            entity = repository.save(entity);

            return entity;
        }
    }

    public Employee viewEmployee(String firstName){
        Collection<Employee> employee1 = repository.findByName(firstName);
        return employee1;


    }

    public Employee findByDdname(String dName){
        Collection<Employee> employee2 = repository.findByDname(dName);
        return employee2;


    }

    public Employee deleteEemp(String id){
        Collection<Employee> employee3 = repository.deleteEmp(id);
        return employee3;


    }


}
