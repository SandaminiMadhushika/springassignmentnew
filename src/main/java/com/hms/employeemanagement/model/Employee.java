package com.hms.employeemanagement.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(EmployeeIdd.class)
public class Employee {
    private String firstName;
    private String lastName;
    private String age;
    private String gender;
    private String designation;
    private String address;
    private String email;
    private String mobileNumber;
    private int factionId;
    private int subId;
    private String nic;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lastModifiedDate;

    @Id
    private int departmentId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column(name = "employee_id")
    private int employeeId;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String age, String gender,
                    String designation, String nic, String address, String email,
                    String mobileNumber, int departmentId, int factionId, int subId, Date lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.designation = designation;
        this.nic = nic;
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.departmentId = departmentId;
        this.factionId = factionId;
        this.subId = subId;
        this.lastModifiedDate = lastModifiedDate;
        this.employeeId=employeeId;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

}
