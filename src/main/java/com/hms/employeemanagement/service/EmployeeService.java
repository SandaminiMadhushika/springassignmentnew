package com.hms.employeemanagement.service;

import com.hms.employeemanagement.model.Employee;
import com.hms.employeemanagement.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
    @Autowired
    EmployeeRepository repository;

    public int createEmployee(Employee entity) {
        repository.save(entity);
        System.out.println(entity);
        return 1;
    }

    public List<Employee> findall(){
        List<Employee> employee4 = repository.findAllEmployee();
        LOGGER.info("get all employee from database");
        return employee4;
    }

    public Employee getEmployeeByCompositeKey(int employeeId,int departmentId){
        Employee editemp=repository.getEmployeeByckey(employeeId,departmentId);
        LOGGER.info("get employee from database ById");

        return editemp;
    }

    public List<Employee> viewEmployee(String firstName){
        List<Employee> employee1 = repository.findByName(firstName);
        LOGGER.info("get employee list from database ByName");
       return employee1;
    }

    public List<Employee> findByDdname(String dName){
        List<Employee> employee2 = repository.findByDname(dName);
        LOGGER.info("get employee list from database ByDepartmentName");
        return employee2;
    }

    public int deleteEmp(int employeeId,int departmentId){
        int delete=repository.deleteEmp(employeeId,departmentId);
        LOGGER.info("delete employee ById");

        return delete;
    }
    public void doStuff(final String value) {

        LOGGER.trace("doStuff needed more information - {}", value);

        LOGGER.debug("doStuff needed to debug - {}", value);

        LOGGER.info("doStuff took input - {}", value);

        LOGGER.warn("doStuff needed to warn - {}", value);

        LOGGER.error("doStuff encountered an error with value - {}", value);

    }


}
