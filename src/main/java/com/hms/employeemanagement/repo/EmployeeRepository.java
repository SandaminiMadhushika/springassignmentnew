package com.hms.employeemanagement.repo;

import com.hms.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

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
    @Query(
            value = "SELECT * FROM employee e WHERE e.nic like '90%' AND e.employee_id IN (SELECT employee_id FROM employee e WHERE TIMESTAMPDIFF(YEAR, last_modified_date, CURDATE()>=5)",
            nativeQuery = true)
    Collection<Employee> findAllActiveUsersNative();

    @Query(
            value = "SELECT * FROM employee e WHERE e.firstName=",
            nativeQuery = true)
    Collection<Employee> findByName(String firstName);

    @Query(
            value = "SELECT * FROM employee e ,department d WHERE e.department_id=d.department_id AND d.dname=",
            nativeQuery = true)
    Collection<Employee> findByDname(String dName);

    @Query(
            value = "SELECT * FROM employee e WHERE e.employee_id=",
            nativeQuery = true)
    Collection<Employee> deleteEmp(String id);


}
