package com.hms.employeemanagement.repo;

import com.hms.employeemanagement.model.Deptname;
import com.hms.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 *
 * EmployeeRepository.java
 * this is a repository which is help to do the crud operations
 *
 * @author Sandamini Madushika
 *
 */

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    /**
     * get all employees
     * @return
     */
    @Query(
            value = "SELECT * FROM employee",
            nativeQuery = true)
    List<Employee> findAllEmployee();

    /**
     * get employees by Id
     * @param employeeId
     * @param departmentId
     * @return
     */
    @Query(
            value = "SELECT * FROM employee WHERE employee_id=:employeeId AND department_id=:departmentId",
            nativeQuery = true)
    Employee getEmployeeByckey(@Param("employeeId") int employeeId ,@Param("departmentId") int departmentId);

    /**
     * get employees using conditions
     * @return
     */
    @Query(
            value = "SELECT * FROM employee e WHERE e.nic like '90%' AND e.employee_id IN (SELECT employee_id FROM employee e WHERE TIMESTAMPDIFF(YEAR, last_modified_date, CURDATE()>=5)",
            nativeQuery = true)
    List<Employee> findUsers();

    /**
     * get employees using first name
     * @param firstName
     * @return
     */

    @Query(
            value = "SELECT * FROM employee WHERE first_name=:firstName",
            nativeQuery = true)
    List<Employee> findByName(@Param("firstName") String firstName);

    /**
     * get employees by department name
     * @param dName
     * @return
     */

    @Query(
            value = "SELECT * FROM employee e ,department d WHERE e.department_id=d.department_id AND d.dname=:dName",
            nativeQuery = true)
    List<Employee> findByDname(@Param("dName") String dName);

    /**
     * delete employees
     * @param employeeId
     * @param departmentId
     */

    @Modifying
    @Transactional
    @Query(
            value = "DELETE FROM employee WHERE employee_id=:employeeId AND department_id=:departmentId",
            nativeQuery = true)
    int deleteEmp(@Param("employeeId") int employeeId ,@Param("departmentId") int departmentId);


}
