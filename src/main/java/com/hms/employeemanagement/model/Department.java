package com.hms.employeemanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    private int departmentId;
    private String dName;


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return dName;
    }

    public void setDepartmentName(String dName) {
        this.dName = dName;
    }



}
