package com.hms.employeemanagement.repo;

import com.hms.employeemanagement.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * EmployeeRepository.java
 * this is a repository which is help to do the crud operations
 *
 * @author Sandamini Madushika
 *
 */

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
