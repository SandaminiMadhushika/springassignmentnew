package com.hms.employeemanagement.service;

import com.hms.employeemanagement.EmployeeManagementApplication;
import com.hms.employeemanagement.model.Employee;
import com.hms.employeemanagement.repo.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes= EmployeeManagementApplication.class)
class EmployeeServiceTest {
    @InjectMocks
    EmployeeService employeeService;

   @Mock
   EmployeeRepository employeeRepository;

    @Test
    void testFindByName() {
     //  EmployeeService employeeService=new EmployeeService();
       // List<Employee> emp= employeeService.viewEmployee("Supun");
       // System.out.println(emp.get());
//        for(int i=0;i<emp.size();i++){
//            System.out.println(emp.get(i).getFirstName());
//            //Assert.notNull(emp.get(i),"pass the test case");
//            // assertNotNull(emp.get(i),"pass");
//
//
//        }
     //  assertNull("ok",emp);
//        //  assertEquals(5,5);
    Employee e1=new Employee("Supun","Saranga","23","male","Project Manager","34657483v","Moratuwa","ghfghf@gmail.com","5764456783",2,1,1,new Date(2013-01-01));
        Employee e2=new Employee("Supun","Hasitha","25","male","HR","34637483v","Galle","ghfgdedhf@gmail.com","5765456783",1,2,1,new Date(2014-02-01));

        //  e1.setFirstName("hjhj");
    // Employee e2=new Employee();
  // e2.setFirstName("hjhj");

        List<Employee> empp= new ArrayList<Employee>();
//        for(int i=0;i<empp.size();i++) {
            empp.add(e1);
           empp.add(e2);
            Mockito.when(employeeService.viewEmployee("Supun")).thenReturn(empp);
            System.out.println(empp.get(0).getDesignation());
            assertNotNull(empp);
         //   System.out.println(empp.get(1).getFirstName());

            // System.out.println(empp.get(1).getFirstName());

        }

    @Test
    void testFindByDdName() {
        Employee e1=new Employee("Supun","Saranga","23","male","Project Manager","34657483v","Moratuwa","ghfghf@gmail.com","5764456783",2,1,1,new Date(2013-01-01));
        Employee e2=new Employee("Supun","Hasitha","25","male","HR","34637483v","Galle","ghfgdedhf@gmail.com","5765456783",1,2,1,new Date(2014-02-01));

        List<Employee> empp2= new ArrayList<Employee>();
        empp2.add(e1);
        empp2.add(e2);

        Mockito.when(employeeService.findByDdname("ENG")).thenReturn(empp2);
        System.out.println(empp2.get(1).getDesignation());
        assertNotNull(empp2);

//        //  assertEquals(5,5);


    }

    @Test
    void testGetEmployeeByckey(){
        Employee e1=new Employee("Supun","Saranga","23","male","Project Manager","34657483v","Moratuwa","ghfghf@gmail.com","5764456783",2,1,1,new Date(2013-01-01));
        Mockito.when(employeeService.getEmployeeByCompositeKey(0,2)).thenReturn(e1);
        System.out.println(e1.getDesignation());
        assertNotNull(e1);
    }

    @Test
    void testDeleteEmp(){
        int x=1;
      //  Employee e1=new Employee("Supun","Saranga","23","male","Project Manager","34657483v","Moratuwa","ghfghf@gmail.com","5764456783",2,1,1,new Date(2013-01-01));
        Mockito.when(employeeService.deleteEmp(0,2)).thenReturn(x);
      //  System.out.println(e1.getDesignation());
        assertEquals(1,x);
    }

    @Test
    void testCreateEmployee(){
        int y=1;
          Employee e1=new Employee("Supun","Saranga","23","male","Project Manager","34657483v","Moratuwa","ghfghf@gmail.com","5764456783",2,1,1,new Date(2013-01-01));
        Mockito.when(employeeService.createEmployee(e1)).thenReturn(y);
        //  System.out.println(e1.getDesignation());
        assertEquals(1,y);
    }

    @Test
    void testFindall(){
        //int y=1;
        Employee e1=new Employee("Supun","Saranga","23","male","Project Manager","34657483v","Moratuwa","ghfghf@gmail.com","5764456783",2,1,1,new Date(2013-01-01));
        Employee e2=new Employee("Supun","Hasitha","25","male","HR","34637483v","Galle","ghfgdedhf@gmail.com","5765456783",1,2,1,new Date(2014-02-01));
        List<Employee> empp3= new ArrayList<Employee>();
        empp3.add(e1);
        empp3.add(e2);
        Mockito.when(employeeService.findall()).thenReturn(empp3);
        //  System.out.println(e1.getDesignation());
        assertNotNull(empp3);
    }

}