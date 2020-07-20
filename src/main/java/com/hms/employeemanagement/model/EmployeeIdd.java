package com.hms.employeemanagement.model;

import java.io.Serializable;

public class EmployeeIdd implements Serializable {
    private int employeeId;
    private int departmentId;

    public EmployeeIdd() {
    }

    public EmployeeIdd(int employeeId, int departmentId){
        this.employeeId=employeeId;
        this.departmentId=departmentId;

    }

}
