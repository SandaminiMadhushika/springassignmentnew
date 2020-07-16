package com.hms.employeemanagement.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(EmployeeId.class)
public class Employee {
    private String fName;
    private String lName;
    private String age;
    private String gender;
    private String designation;
    private String address;
    private String email;
    private String mobileNum;
    private int factionId;
    private int subId;

    private Date lastDate;

@Id
    private int departmentId;


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
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

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    private int employee_id;


    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }


//    public Employee(){
//
//    }

//    Employee(String name,Date lastaudit){
//           this.name=name;
//            this.lastaudit=lastaudit;
//    }

//    public Date getLast_modified_date() {
//
//        return last_modified_date;
//
//    }
//
//    public void setLast_modified_date(Date last_modified_date) {
//
//        this.last_modified_date = last_modified_date;
//
//    }
//

//    @GeneratedValue(strategy = GenerationType.AUTO)
//
//    @Column(name="employee_id")
//
//
//    public int getId() {
//
//        return employee_id;
//
//    }
//
//    public void setId(int employee_id) {
//
//        this.employee_id = employee_id;
//
//    }
//
//    public int getDepartment_id() {
//
//        return department_id;
//
//    }
//
//    public void setDepartment_id(int department_id) {
//
//        this.department_id = department_id;
//
//    }
//
//
//    public String getFirst_name() {
//
//        return first_name;
//
//    }
//
//    public void setFirst_name(String first_name) {
//
//        this.first_name = first_name;
//
//    }
//
//    public String getLast_name() {
//
//        return last_name;
//
//    }
//
//    public void setLast_name(String last_name) {
//
//        this.last_name =last_name;
//
//    }
//    public String getAge() {
//
//        return age;
//
//    }
//
//    public void setAge(String age) {
//
//        this.age = age;
//
//    }
//    public String getGender() {
//
//        return gender;
//
//    }
//
//    public void setGender(String gender) {
//
//        this.gender = gender;
//
//    }
//    public String getDesignation() {
//
//        return designation;
//
//    }
//
//    public void setDesignation(String designation) {
//
//        this.designation = designation;
//
//    }
//    public String getAddress() {
//
//        return address;
//
//    }
//
//    public void setAddress(String address) {
//
//        this.address = address;
//
//    }
//    public String getEmail() {
//
//        return email;
//
//    }
//
//    public void setEmail(String email) {
//
//        this.email = email;
//
//    }
//    public String getMobile_number() {
//
//        return mobile_number;
//
//    }
//
//    public void setMobile_number(String mobile_number) {
//
//        this.mobile_number = mobile_number;
//
//    }
//
//    public int getFaction_id() {
//
//        return faction_id;
//
//    }
//
//    public void setFaction_id(int faction_id) {
//
//        this.faction_id = faction_id;
//
//    }
//    public int getSub_id() {
//
//        return sub_id;
//
//    }
//
//    public void setSub_id(int sub_id) {
//
//        this.sub_id = sub_id;
//
//    }

//    public String toString(){
//
//        return employee_id+" | " + first_name+ " | "+ last_name+"|"+age+"|"+gender+"|"+designation+"|"+address+"|"+email+"|"+mobile_number+"|"+department_id+"|"+faction_id+"|"+sub_id+"|"+last_modified_date;
//
//    }
}
