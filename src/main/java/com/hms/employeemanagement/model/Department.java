package com.hms.employeemanagement.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    private int departmentId;


    @Enumerated(EnumType.STRING)
    private Deptname dName;


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Deptname getdName() {
        return dName;
    }

    public void setdName(Deptname dName) {
        this.dName = dName;
    }

}
