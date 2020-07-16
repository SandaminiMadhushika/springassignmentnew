package com.hms.employeemanagement.model;

import java.io.Serializable;

public class EmployeeId implements Serializable {
    private int employee_id;
    private int departmentId;

    public EmployeeId(int employee_id,int departmentId){
        this.employee_id=employee_id;
        this.departmentId=departmentId;

    }
}
