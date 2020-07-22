package com.hms.employeemanagement.service;

import com.hms.employeemanagement.model.Employee;
import com.hms.employeemanagement.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public int createEmployee(Employee entity) {
        repository.save(entity);
        System.out.println(entity);
        return 1;
    }

    public List<Employee> findall(){
        List<Employee> employee4 = repository.findAllEmployee();
        return employee4;
    }

    public Employee getEmployeeByCompositeKey(int employeeId,int departmentId){
        Employee editemp=repository.getEmployeeByckey(employeeId,departmentId);
        return editemp;
    }

    public List<Employee> viewEmployee(String firstName){
        List<Employee> employee1 = repository.findByName(firstName);
       return employee1;
    }

    public List<Employee> findByDdname(String dName){
        List<Employee> employee2 = repository.findByDname(dName);
        return employee2;
    }

    public int deleteEmp(int employeeId,int departmentId){
        int delete=repository.deleteEmp(employeeId,departmentId);
        return delete;
    }


}
